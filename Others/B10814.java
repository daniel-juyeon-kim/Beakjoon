package Main;

import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		// 시도횟수
		int testcase = in.nextInt();
		
		// 나이를 저장하는 배열
		int age [] = new int [testcase];
		// 이름을 저장하는 배열
		String name [] = new String [testcase];
		
		// 나이 최대값 선언
		int maxAge = 0;
		
		// 나이 최대값 & 이름과 나이 입력 받음
		for (int i = 0 ;i < testcase; i++) {
			age[i] = in.nextInt();
			name[i] = in.next();
			if (maxAge < age[i])
				maxAge = age[i];
		}
		
		// 나이순 서치 + 가입순 서치
		for (int i = 1 ;i <= maxAge;i++) 
			for (int j = 0 ;j < testcase; j++) 
				// 조건에 해당되는 경우 StringBuilder에 추가
				if (i == age[j])
					sb.append(age[j] + " " + name[j] + "\n");
		
		// 출력
		System.out.println(sb);
		
		
	}

}
