package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		// 문자열을 입력할 수
		int testcase = in.nextInt();
		
		// 문자열을 저장할 배열의 크
		String [] stringArray = new String [testcase];
			
		// 간단한 입력
		for (int i = 0 ;i < stringArray.length; i ++) {
			stringArray[i] = in.next();
		}

		// StringBuilder를 생성하기 위한 선언
		String result = stringArray[0];
		StringBuilder sb = new StringBuilder(result);
	
		
		// 열 탐색 0번 배열 1번 인덱스 
		
		// 출력부 
		for (int row = 0; row < stringArray.length-1 ; row++) {
			for (int col = 0; col <stringArray[0].length() ;col++) {
				char nowIndex = stringArray[row].charAt(col);
				char nextIndex = stringArray[row+1].charAt(col);
				if(nowIndex != nextIndex) {
					// 디버그 코드 
					// System.out.println(sb);
					// System.out.println("now : " + nowIndex + " " + col);
					// System.out.println("next : " + nextIndex + " " + col);
					sb.setCharAt(col, '?');
					//System.out.println("resultValue : " + sb);
				}
			}
		}
		System.out.println(sb);
	}
}
