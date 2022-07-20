package Calculator;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
	
		// 문자열로 두 수를 입력받음
		String v1 = in.next();
		String v2 = in.next();
		
		// 결과 값을 저장받는 변수
		long result = 0;
		
		// v1 v2의 문자열을 하나씩 떼어 정수형으로 변환 후 계
		for(int i = 0; i < v1.length();i++) {
			int value1 = Character.getNumericValue(v1.charAt(i));
			for (int j = 0; j < v2.length();j++) {
				int value2 = Character.getNumericValue(v2.charAt(j));
				result += (long) value1 * (long) value2;
			}
		}
		// 출력
		System.out.println(result);
		
	}
}