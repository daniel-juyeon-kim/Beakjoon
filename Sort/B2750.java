package Sort;

import java.util.*;

public class B2750 {

	public static void main(String[] args) {
		

		// 문제 : https://www.acmicpc.net/problem/2750
		// 알고리즘 설명 :
		// 최대최소를 판별 후 최대값을 새로운 배열에 넣고 기존 기존 배열의 최대값에 최소값을 넣어
		// 반복하여 최대값을 새로운 배열에 저장하는 알고리즘
		
		Scanner in = new Scanner(System.in);
		
		// 입력받을 정수의 수 입력 
		int n =  in.nextInt();
		
		// 입력받을 배열
		int arr [] = new int [n];
		// 입력받은 배열을 재배열 할 배열
		int arr2 [] = new int [n];

		// arr 배열에 정수 입력
		for (int i = 0; n > i; i++) {
			arr[i] = in.nextInt();
		}
		
		// 배열중 최대 최소 지정
		int max = arr[0]; 
		int min = arr[0];
		
		// m은 arr배열중 최대값의 배열값
		int m = 0;
		int arrlen = arr.length-1;
		
		// arr배열의 길이만큼 반복
		for (int j = 0; arr.length > j; j++) {
			max = arr[0];
			min = arr[0];
			// 최대최소값을 arr배열의 0번째 인덱스로 지정 후 최대값을 변별후
			// arr에 최대값에 자리에 최소값을 넣고 arr2배열에 최대값을 새로운 배열에 저장
			for (int i = 0; arr.length > i; i++) {
				if (max <= arr[i] ) {
					max = arr[i]; 
					m = i;
				}
				else if (arr[i] <= min ) {
					min = arr[i]; 
				}
			}
			
			arr2 [arrlen] = max;
			arr[m] = min;
			arrlen--;
		}
		
		// 출력부
		for (int j = 0; arr2.length > j; j++) {
			System.out.println(arr2[j]);
		}
	}

}
