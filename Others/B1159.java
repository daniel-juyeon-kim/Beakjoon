package Calculator;

import java.util.*;

public class Main {
	//1159

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		// 문자열을 입력할 수
		int testcase = in.nextInt();
		
		String result = "";
		
		// 문자열을 저장할 배열의 크
		String [] stringArray = new String [testcase];
			
		// 간단한 입력
		for (int i = 0 ;i < stringArray.length; i ++) {
			stringArray[i] = in.next();
		}
		
		// 사전순 정렬
		Arrays.sort(stringArray);
		
		// 문자열 2개를 비교하면서 cnt를 1씩 올리므로 초기값은 1이여야 한다.
		int cnt  =  1;
		for (int i = 0 ;i < stringArray.length-1; i ++) {
			// 문자열 2개의 첫 글자가 같으면 1씩 상
			if (stringArray[i].charAt(0) == stringArray[i+1].charAt(0)) {
				cnt++;
			}
			// 아닌경우 1로 초기화
			else if (stringArray[i].charAt(0) != stringArray[i+1].charAt(0)){
				cnt =1;
			}
			// cnt가 5일때만 해당코드 실행 
			if (cnt == 5) {
				result += stringArray[i].charAt(0);
			}
		}
		// result가 아무것도 없는경우 패배 
		if (result == "") {
			System.out.println("PREDAJA");
		}
		// 아닌경우 result출
		else {
			System.out.println(result);
		}

		
	}
}