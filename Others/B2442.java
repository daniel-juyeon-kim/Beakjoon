import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		// 삼각형 모양으로 별을 출력하는 문제 

		// 줄의 수 입력 
		int line = in.nextInt();
		
		// 줄수
		for (int i = 0 ;line > i;i++) {
			// 공백의 수
			for (int j = 0 ; line - i -1 > j; j++) {
				System.out.print(" ");
			}
			// 별의 수
			for (int j = 0 ; (i+1)*2-1 > j; j++) {
				System.out.print("*");
			}
			// 출력
			System.out.println();
		}
	}
}