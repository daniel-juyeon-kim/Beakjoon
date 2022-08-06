package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int testcase = in.nextInt();
		
		// testcase만큼 반복 
		for (int i = 0 ; i < testcase; i++ ) {
		
			int pre = in.nextInt();
			int post = in.nextInt();
			// 공배수를 구하는 코
			for (int j = 1;;j++ ) {
				if (pre * j % post == 0) {
					sb.append(pre * j + "\n");
					break;
				}
			}
		}	
		// 출력 
		System.out.println(sb);
	}

}
