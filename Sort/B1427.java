package Sort;

import java.util.*;

public class B1427 {

	public static void main(String[] args) {
		// 문제 : https://www.acmicpc.net/problem/1427
        // 알고리즘 설명 :
        // 입력받은 수를 반대로 정렬하는 문제이다.
		
		Scanner in = new Scanner (System.in);
		
		// 입력받는 수
		int n = in.nextInt();
	
		
		int n1 = n;
		// 수의 길이를 카운트 하는 변수
		int cnt = 1;
		
		// n이 10이상일대 10으로 나누고 카운트를 올린다.
		while (n >= 10) {
			cnt++;
			n /=10;
		}
		
		// 정렬할 배열		
		int arr [] = new int [cnt];
		// 정렬한 배열을 반대로 배열할 배열
		int arr1 [] = new int [cnt];
		
		// 배열에 각 자릿수의 값을 저장
		for (int i = 0;arr.length>i;i++) {
			arr[i] = n1%10;
			n1 /= 10;
		}
		
		// 정렬 (내장함수)
		Arrays.sort(arr);
		
		// 정렬한 배열을 역으로 배열할 배열에 반대로 저장
		int j = 0;
		for (int i = arr.length-1;0<=i;i--) {
			arr1[j] = arr[i];
			j++;
		}
		
		// 출력부
		for (int i = 0;arr.length>i;i++) {
			System.out.print(arr1[i]);
		}
	}

}
