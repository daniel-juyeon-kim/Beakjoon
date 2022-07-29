package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		// 입력값 1 
		int pre = in.nextInt();
		// 입력값 2
		int post = in.nextInt();
		
		// 결과값 1
		int div = 0;
		
		// 최대공약수
		for (int i = 1 ; i <= pre; i++) {	
	        // 값이 같은경우 pass
			if (pre == post) {
				div = pre;
				break;
			}
			if (pre % i == 0 && post % i == 0) {
				div = i;
			}
		}
		
		// 결과
		sb.append(div + "\n");
		
		// 최소 공배수
		for (int i = 1 ; ; i++) {
			if (pre * i % post == 0) {
				sb.append(pre * i + "\n");
				break;
			}
		}
		
		// 출력	
		System.out.println(sb);
	}

}
