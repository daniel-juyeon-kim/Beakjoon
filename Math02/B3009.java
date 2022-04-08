package Math02;

import java.util.*;

public class B3009 {

	public static void main(String[] args) {
		
		// 문제 : https://www.acmicpc.net/problem/3009
		// 알고리즘 설명 :
		// 입력되는 x,y 값들 중 겹치는 좌표값을 구하고 중간값으로 지정후 
		// 나머지 x,y 값들의 차를 더하여 나머지 좌표를 구한다.
		
		Scanner in = new Scanner (System.in);
		
		// 2차원 배열 생성
		int arr [][] = new int [4][2];
		
		// 3번째 까지만 입력, 나머지 4번째 열은 결과 값 저장용
		for (int i = 0;3 > i;i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}
		
		// 3개의 x,y 좌표값이 중복되는 중간값 변수 선언
		int middleNumber = 0;
		
		// 서치
		for (int i = 0;3 > i;i++) {
			for (int j = 0;3 > j;j++) {
				if (i != j) {
					// 배열의 x 값 y 값이 둘 다 다른경우 j열과 i열이 아닌 나머지 열이 중간값
					if (arr[i][0] != arr[j][0] && arr[i][1] != arr[j][1]) {
						// 중간값 서치
						for (int k = 0;3 > k;k++) {
							if (k != i && k != j) {
								// 중간값 지정
								middleNumber = k;
								// 마지막 열에 값 중간값 저장
								arr[3][0] = arr[k][0];
								arr[3][1] = arr[k][1];		
							}
						}
					}
				}
			}
		}
		
		// 중간값이 있는 열과 다르면서 x값이 같은 경우 y값의 차를 마지막 배열에 더하고
		// y값이 다른경우 x값의 차를 마지막 배열에 더한다
		for (int i = 0;3 > i;i++) {
			if (middleNumber != i) {
				if (arr[middleNumber][0] == arr [i][0]) {
					arr[3][1] += arr[i][1]-arr[middleNumber][1];
				}
				if (arr[middleNumber][1] == arr [i][1]) {
					arr[3][0] += arr[i][0]-arr[middleNumber][0];
				}
			}
		}
		
		// 결과 출력
		System.out.println(arr[3][0] + " " + arr[3][1]);
		
	}
}
