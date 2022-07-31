package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int testcase = in.nextInt();
		
		int arr [] = new int [testcase];
		
		// input  
		for (int i = 0 ; i < arr.length; i++ ) {
			arr[i] = in.nextInt();
		}	
		
		Arrays.sort(arr);
				
		int result = 0;
		
		// 배열의 0번째 부터 j까지의 값을 result에 더한다. 
		for (int i = 0 ; i < arr.length; i++ ) {
			for (int j = 0; j <= i; j++) {
				result += arr[j];
			}
		}	
		// 출력 
		System.out.println(result);
	}

}
