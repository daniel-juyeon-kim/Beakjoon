import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// 달 입력 
		int m = in.nextInt();
		// 일 입력
		int d = in.nextInt();
		
		// 순차적으로 달을 누적하여 일에 더
		for (int i = 1; i < m; i++) {
			// 해당 달에 따라 계산하는 일의 값이 달라짐
			if (i == 2)
				d += 28;
			else if (i == 4 || i == 6 || i== 9|| i== 11) {
				d += 30;
			}
			else if (i == 1 || i == 3 || i== 5|| i== 7 || i == 8 || i == 10 || i== 12){
				d += 31;
			}
		}
		
		// 결과값을 저장하는 result 변수 선언
		String result = ""; 
		
		// 일 % 7을 시행하여 결과값 출력 
		switch (d % 7) {
		case 1 : result = "MON";
			break;
		case 2 : result = "TUE";
			break;
		case 3 : result = "WED";
			break;
		case 4 : result = "THU";
			break;
		case 5 : result = "FRI";
			break;
		case 6 : result = "SAT";
			break;
		case 0 : result = "SUN";
			break;		
		}
		
		// 출력
		System.out.println(result);
	
	}
}