package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int testcase = in.nextInt();
		
		for (int i = testcase ;i > 0 ;i--) {
			
			for (int j = 0 ; j < testcase - i ; j++) {
				sb.append(" ");
			}
			
			for (int j = 0 ;j < i ; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
