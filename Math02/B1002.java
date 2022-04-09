package Math02;

import java.util.*;

public class B1002 {

	public static void main(String[] args) {
		// 문제 : https://www.acmicpc.net/problem/1002
		// 알고리즘 설명 :
		// 2개의 원이 몇개의 점이 겹치는지 출력하는 문제
		// 각 유형을 정리하고 조건식이 안겹치게 하는게 중요한 문제이다.

		Scanner in = new Scanner (System.in);

		// 시도 횟수 testcase
		int testcase = in.nextInt();
		
		for (int i = 0 ;testcase > i; i++) {
		
			// 좌표값과 거리값 입력
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int r1 = in.nextInt();
			
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int r2 = in.nextInt();
			
			// 좌표와 좌표사이의 거리 length
			double length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			
			// 좌표값과 거리값이 전부 같은 경우 나올 수 있는 점의 수는 무한
			// 아래의 조건문과 곂치는 부분이 있어 조건문의 순서가 중요하다.
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}
			// 한점에서 외접 또는 내접하는 경우
			else if (length == r1+r2 || length == r1-r2 || length == r2-r1) {
				System.out.println(1);
			}
			// 두 점에서 내접 외접 하거나 안만나는 경우
			// 좌표 사이의 거리가 반지름 보타 작을 때
			else if (r1 + r2 > length){
				// 반지름 범위 안에 원이 있는경우
				if (r1 > length + r2 || r2 > length + r1) {
					System.out.println(0);
				}
				// 아닌경우는 원의 안에서 두 점이 접함
				else {
					System.out.println(2);		
				}
			}
			// 서로 밖에서 만나지 않는 경우
			else {
				System.out.println(0);
			}
			
		}
		
	
	}

}
