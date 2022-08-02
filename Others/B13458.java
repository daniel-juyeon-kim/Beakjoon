package Main;

import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int result = 0;
		
		int N = in.nextInt();
		int A [] = new int [N];
		
		for (int i = 0; i < A.length;i++) {
			A[i] = in.nextInt();
		}
		
		int B = in.nextInt();
		int C = in.nextInt();
		
		for (int i = 0; i < A.length;i++) {
			A[i] -= B;
			result++;
			if (A[i] > 0) {
				result += A[i] / C;
				A[i] %= C;
				if (A[i] > 0) {
					result++;
				}
			}
		}
		System.out.println(result);
		
	}

}
