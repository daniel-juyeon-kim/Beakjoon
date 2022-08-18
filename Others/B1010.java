package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int testcase = in.nextInt();
		
		for (int i = 0 ; i < testcase ; i++) {
			int pre = in.nextInt();
			int post = in.nextInt();
			
			if (pre == 1) {
				sb.append(post+"\n");
			}
			else if (pre == post) {
				sb.append(1+"\n");	
			}
			else {
				// post = 4, pre = 2
				// post = 5, pre = 3
				if (post/2 <= pre) {
					pre = post - pre;
				}
				// calculate
				long result = 1;
				int toPre = 1;
				long tempPre = 1;
				long tempPost = 1;
				while(toPre <= pre) {
					if (post % toPre == 0) {
						result *= post / toPre;
					}
					else {
						int max = findMaxDivisor(toPre, post);
						tempPre *= toPre / max;
						tempPost *= post / max;
					}
					toPre++;
					post--;
				}
				sb.append(result * tempPost / tempPre+"\n");
			}
					
		}
		System.out.println(sb);
	}
	static int findMaxDivisor (int toPre, int post) {
		int max = 0;
		for (int maxDivisor = 1; maxDivisor <= toPre / 2; maxDivisor++) {
			if (toPre % maxDivisor == 0 && post % maxDivisor == 0) {
				max = maxDivisor;
			}
		}
		return max;
	}

}
