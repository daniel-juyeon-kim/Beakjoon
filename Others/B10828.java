
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		StringBuilder sb = new StringBuilder ();
		
		// 시도횟수
		int testcase =in.nextInt();
		
		// 리스트 선언
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		// 시도횟수만큼 반복
		for (int i = 0 ; i < testcase; i++) {
			// 문자열 입력 
			String order = in.next();
			
			// 각 케이스마다 다른 코드를 실행
			switch (order) {
			case "push" : 
				list.add(in.nextInt());
				break;
				
			case "pop" : 
				if (list.isEmpty()) {
					sb.append("-1" + "\n");
					break;
				}
				else {
					sb.append(list.get(list.size()-1) + "\n");
					list.remove(list.size()-1);
					break;
				}
			case "size" :
				sb.append(list.size() + "\n");
				break;
				
			case "empty" : 
				if (list.isEmpty()) {
					sb.append("1" + "\n");
					break;
				}
				else {
					sb.append("0" + "\n");
					break;	
				}
			case "top" : 
				
				if ( list.isEmpty()) {
					sb.append("-1" + "\n");
					break;
				}
				else {
					sb.append(list.get(list.size()-1) + "\n");
					break;
				}
			}				
		}
		// 출
		System.out.println(sb);
	}
}
