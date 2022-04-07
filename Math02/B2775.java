package Math02;

import java.util.*;

public class B2775 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// 문제 : https://www.acmicpc.net/problem/2775
		// 알고리즘 설명 :
		// k층 n호 이전 k-1 , n 호 까지의 배열을 만들고 저장한후 k층 n호의 총 인원수를 출력한다.
		
		// 테스트 케이스 T
		int T = in.nextInt();
		
		// 반복
		for (int i = 0; T > i; i++) {
			// k층
			int k = in.nextInt();
			// n호
			int n = in.nextInt();
			
			// k*n크기의 2차원 배열 (1층이 아닌 0 층부터 있어서 k-1이 아니라 k이다.)
			int arr [][] = new int [k][n];

			// 0 층 정리
			int sum = 1;
			for (int j = 0; n > j; j++) {
				arr[0][j] = sum;
				sum++;
			}
				
			// 층당
			sum = 0;
			for (int j = 1; k > j; j++) {
				// 호수의 인원 수
				for (int l = 0; n > l; l++) {
					sum += arr[j-1][l];
					arr[j][l] = sum;
				}	
				// 초기화 
				sum = 0;
			}
			
			// 결과 출력부
			int result = 0;
			for (int l = 0; n > l; l++) {
				result += arr[k-1][l];
			}
			System.out.println(result);  
		}
		
	}
}
