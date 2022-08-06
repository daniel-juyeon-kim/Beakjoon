package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder ();
	
		
		// 시도 횟수
		int testcase = in.nextInt();
		
		// 배열의 크기 선언
		int arr [] = new int [testcase];
		
		// 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		// 배열 순회
		for (int i = 1; i < arr.length; i++) {
			// 최대 공배수
			int divMaxValue = 0;
			
			// 두개의 값 (첫번째 바퀴와 비교 대상의 바퀴의 최대 공배수를 구함			
			for (int j = 2;j <= arr[0];j++) {
				if (arr[0] % j == 0 && arr[i] % j == 0) 
					divMaxValue = j;
			}
			// 최대 공배수가 없는 경우 값은 초기값 0
			if (divMaxValue == 0)
				sb.append(arr[0] + "/" + arr[i] + "\n");
			else 
				sb.append(arr[0]/divMaxValue + "/" + arr[i]/divMaxValue + "\n");
		
		}
		// 출력
		System.out.println(sb);
	}
}
