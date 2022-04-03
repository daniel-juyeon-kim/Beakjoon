package Math02;

import java.util.*;

public class B2581 {

	public static void main(String[] args) {
		
		// 문제 : https://www.acmicpc.net/problem/2581
		// 알고리즘 설명 :
		// 최소값과 최대값을 입력받아 그 사이에 소수를 찾아내어 그 소수중 최소값을 찾아내고 소수들의 합을 출력하는 프로그램
		// 소수는 1과 자기자신만이 최소공배수인 수 이다. 즉 2이상 자지자신-1까지 나누었을 때 전부 나머지가 0이 아니여야 한다.
		
		Scanner in = new Scanner (System.in);
		
		// 입력부
		// 소수 범위 입력부
		int min = in.nextInt();
		int max = in.nextInt();
		
		// 합과 소수값 변수 선언
		int sum = 0;
		int prime = 0;
		
		// min부터 max까지 스캔
		for (int m = max ;min <= m; m--) {
			// cnt == 나머지가 나올경우 증가
			int cnt=0;
			// 2 이상의 수로 나누기 단 해당 수 미만 까지
			for (int j = 2 ;m > j; j++) {
				if (m % j == 0) {
					continue;
				}
				else {
					cnt ++;
				}
			}
			// 만약 cnt가 2부터 해당 수 -1 까지 나머지가 나온다면 소수이므로
			// sum과 prime에 각각 연산을 실행한다.
			if (cnt == m-2) {
				sum += m;
				prime = m;
			}
		}
		
		// 출력부
		// 위 반복문으로 cnt가 해당수 -2와 같지 않다면 prime값은 0 이므로 -1 출력
		if (prime == 0) {
			System.out.println(-1);
		}
		// 그게 아니라면 sum과 prime을 출력한다.
		else {
			System.out.println(sum);
			System.out.println(prime);
		}
	}
}
