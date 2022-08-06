package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		// 시도횟수
		int N = in.nextInt();
		
		int A [] = new int [N];
		
		// input 1 
		for (int i = 0 ;i < A.length; i++) {
			A[i] = in.nextInt();
		}
		Arrays.sort(A);
		
		int M = in.nextInt();
	
		int mArr [] = new int [M];
	
		// input 2
		for (int i = 0 ;i < mArr.length; i++) {
			mArr[i] = in.nextInt();
		}		
		
		
		for (int i = 0 ;i < mArr.length; i++) {
			if (Bsearch(A,mArr[i]) == -1)
				sb.append(0 + "\n");
			else
				sb.append(1 + "\n");
		}
	
		System.out.println(sb);
	}
	
	static int Bsearch (int[] arr , int value ) {
	
		int preIndex = 0;
		int postIndex = arr.length-1;
		
		while (preIndex <= postIndex) {
			int mid = (preIndex + postIndex) /2;
			
			if (value > arr[mid]) 
				preIndex = mid +1;
			
			else if (value < arr[mid]) 
				postIndex = mid -1;
			
			else 
				return mid;
			
		}
		
		return -1;
	}
	
}
