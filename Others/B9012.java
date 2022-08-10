package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder ();
		
		int testcase = in.nextInt();
		Loop :
		for (int i = 0 ;i < testcase; i++) {
			String str = in.next();
			int cnt = 0;
			for (int j = 0 ;j < str.length();j++) {
				if (str.charAt(j) == '(' ) {
					cnt++;
				}
				else {
					cnt--;
					if (cnt == -1) {
						sb.append("NO" + "\n");
						continue Loop;
					}
				}
				
			}
			if (cnt == 0) {
				sb.append("YES" + "\n");
			}
			else {
				sb.append("NO" + "\n");
			}
		}
		
		System.out.println(sb);
	}
}
