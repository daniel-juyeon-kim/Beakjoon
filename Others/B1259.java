import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		// 무한 반복
		while (true) {
			String compare = "";
			String str = in.next();
			// 입력값이 0 이면 무한루프를 벗어남
			if (str.equals("0")) {
				break;
			}
				
			// 짝수의 경우
			if (str.length()%2 == 0) {
				for (int i = str.length()-1 ; i > str.length()/2-1;i-- ) {
				    compare = compare + Character.toString(str.charAt(i));
				}
				 	
			}
			// 홀수의 경우
			else {
				for (int i = str.length()-1 ; i > str.length()/2;i-- ) {
				    compare = compare + Character.toString(str.charAt(i));
				}
				
			}
			
			// 비교값이 같은경우 yes
			if (str.substring(0, str.length()/2).equals(compare)) {
				System.out.println("yes");
			}
			// 아닌경우 no 출력
			else {
				System.out.println("no");
			}
	
		}

	}
}
