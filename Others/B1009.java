package Main;

import java.util.*;
import java.math.*;

public class Main {
    // testcase만큼 수를 입력 받아 testcase만큼 반복하여 10 이하의 나머지를 구하는 문제
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        // 시행횟수 testcase
		int testcase = in.nextInt();
	
        // testcase만큼 반복
		for (int i = 0;testcase > i;i++) {
            // 밑
			int base = in.nextInt();
			// 지수
            int exponent = in.nextInt();
			// 결과값
            int result = base%10;
			for (int j = 0 ;exponent -1> j ; j++) {
				result *= base;
				result %= 10;
			}
			if (result == 0) System.out.println(10);
			else System.out.println(result);
		}
		
	}

}