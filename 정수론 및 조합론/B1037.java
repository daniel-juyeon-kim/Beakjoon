// 1037

package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 선언
		int testcase = in.nextInt();
		int n [] = new int [testcase];
		
		// input
		for(int i = 0 ;i < testcase; i++) {
			n[i] = in.nextInt();
		}
		// 초기값
		int max = n[0];
		int min = n[0];
		
		// max, min
		for(int i = 0 ;i < testcase; i++) {
			if (n[i] >= max) {				
				max = n[i];
			}
			if (n[i] <= min) {				
				min = n[i];
			}
		}
		
		// output
		System.out.println(max * min);
			
	}
} 