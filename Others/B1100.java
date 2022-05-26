package Main;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		// 특정 칸에 있는 F문자를 인식하여 개수를 출력하는 문제
		// 카운트
		int cnt = 0;

		String arr [] = new String [8];
		// 배열에 데이터 입력
		for (int i = 0 ;arr.length>i;i++) {
			arr[i] = in.next();
		}

		// 계산
		for (int i = 0 ;arr.length>i;i++) {
			// 짝수행의 경우
			if (i%2 == 0) {
				// 짝수열의 칸 중 F이면 카운트
				for (int j = 0 ;arr.length > j;j++) {
					if (arr[i].charAt(j) == 'F' && j%2 == 0) {
						cnt++;
					}
					
				}
			}
			// 홀수행의 경우
			else {
				// 홀수열의 칸 중 F이면 카운트
				for (int j = 1 ;arr.length > j;j++) {
					if (arr[i].charAt(j) == 'F' && j%2 == 1) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}