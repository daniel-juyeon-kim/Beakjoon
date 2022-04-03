package Math02;

import java.util.*;

public class B1978 {

	public static void main(String[] args) {
		// 문제 : https://www.acmicpc.net/problem/1978
		// 알고리즘 설명 :
		// 테스트 케이스n만큼 입력받아 n번 숫자를 입력받고 그 숫자가 소수인지 판별하는 문제
		// B2581과 많이 유사한 문제이다 이 문제도 소수의 특징을 알고있으면 쉽게 풀 수 있다.
		
		Scanner in = new Scanner (System.in);
		
		// 테스트 케이스 n
		int n = in.nextInt();
		// 소수의 갯수 prime
		int prime = 0;

		// 테스트 케이스만큼 반복
		for (int i = 1;n>=i;i++) {
			// B2581과 마찬가지로 2이상 num-1까지 나누어 나머지가 나오는경우 cnt증가
			int num = in.nextInt();
			int cnt = 0;
			// num에 1이 오는 경우를 제외한다. (1은 소수가 아니다.)
			if (num >=2) {
				// 2부터 num-1까지 숫자로 num을 나누어 나머지가 나오는지 확인한다.
				for(int j = 2; num > j;j++) {
					if (num%j==0) {
						continue;
					}
					else {
						cnt++;
					}
				}
				// 만약 2이상 num-1까지의 수로 나눈 나머지가 전부 0이 아닌경우 
				// prime (소수) 증가
				if (cnt == num-2) {
					prime++;
				}	
			}
		}
		// 출력부
		System.out.println(prime);
	}

}
