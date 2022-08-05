package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int testcase = in.nextInt();
	
		// nextLine 씹힘 방지
		in.nextLine();
		
		// 문자열 배열 선언
		String arr [] = new String [testcase];
		
		
		for (int i = 0 ; i < testcase; i++) {
			arr [i] = in.nextLine();
		}
		
		for (int i = 0 ; i < arr.length; i++) {
			int startindex = 0;
			for (int endindex = 0 ; endindex < arr[i].length(); endindex++) {
				if (arr[i].charAt(endindex) == ' ') {
					for (int k = endindex-1; k >= startindex;k--) {
						sb.append(arr[i].charAt(k));
					}
					sb.append(" ");
					startindex = endindex+1;
				}
				else if (endindex == arr[i].length()-1) {
					for (int k = endindex; k >= startindex;k--) {
						sb.append(arr[i].charAt(k));
					}
					sb.append("\n");
					startindex = 0;
				}
			}
		}
		System.out.println(sb);	
	}
}
