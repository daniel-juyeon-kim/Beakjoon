package Math02;

import java.util.*;

public class B3053 {

	public static void main(String[] args) {
		// 문제 : https://www.acmicpc.net/problem/2775
		// 알고리즘 설명 :
		// 두번째 출력문에 자세한 설영
		
		Scanner in = new Scanner (System.in);
		
		// n 입력
		double n = in.nextDouble();
		
		// 반지름의 넓이 n^2x Pi
		System.out.println(n*n*Math.PI);
		
		// 문제에서 말하는 반지름 n은 x축과 y축의 길이의 합이 n이 되어야하고
		// 문제에서 말하는 원의 정의는 이에 해당하는 점들의 집합이다.
		// 즉 그림을 그리면 기울어진 정사각형이 나온다.
		System.out.printf("%.6f",n*n*2);
	}

}
