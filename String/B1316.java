package String;

import java.util.*;

public class B1316 {
	
	public static void main(String[] args) {
		
		// 문제 : https://www.acmicpc.net/problem/1316
		// 알고리즘 설명 :
		// 반복 횟수만큼 반복하는 반복문 생성 후 문자열을 받고 중복되는 문자열을 제외하고
		// 다른 문자열만을 새로운 배열에 배치하여 비교한다.
		
		Scanner in = new Scanner (System.in);
		
		// 반복 횟수
		int n = in.nextInt();
		// wordCnt라는 변수는 총 문자 입력 횟수에서
		// 조건에 맞지 않는 문자열은 제외하기 위한 변수이다.
		
		int wordCnt = n;
		
		for (int a = 0; n > a; a++) {
			String str = in.next();
			
			// 입력받은 문자열을 전부 스캔하여 다를 경우에만 cnt 상승
			// cnt는 새로운 배열의 길이를 지정하기 위한 변수이다.
			int cnt = 1;
			for (int i = 0;str.length()-1 > i;i++) {
				if (str.charAt(i) != str.charAt(i+1)) {
					cnt++;
				}
			}
		
			// cnt 길이의 배열 생성
			char arr [] = new char [cnt];

			// k는 필터링된 배열을 지정해주는 역할이다.
			int k = 0;
			for (int i = 0;str.length() -1 > i;i++) {
				// 문자열의 i번째 문자와 i+1번째 문자열이 다를 경우 이를 각각 k번째 k+1번째 배열에 저장한다.
				if (str.charAt(i) != str.charAt(i+1)) {
					arr[k] = str.charAt(i); arr[k+1] = str.charAt(i+1);
					k++;
				}
				//위 주석문에 해당이 안되는 경우 스킵한다.
				else {
					continue;
				}
			}
			// k를 초기화 해준다.
			k = 0;
			
			// for문을 2중으로 사용하고 조건은 두 반복문 둘다 arr배열 전체를 스캔하되
			// i가 j 보다 작은것을 기준으로 스캔한다.
			Loop: 
			for (int i = 0; arr.length-1 > i; i++) {
				for (int j = 0; arr.length>j; j++) {
					// 만약 위 주석의 설명에 부합하면서 i번째 arr배열과 j번째 arr배열이 같은경우
					// wordCnt에서 1씩 감소시키고 Loop로 되돌아간다.
					if (i < j && arr[i] == arr[j]) {
						wordCnt--;
						break Loop;
					}
				}
			}
		}
		System.out.println(wordCnt);
	}
}