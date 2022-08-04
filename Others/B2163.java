package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int pre = in.nextInt();
		
		int post = in.nextInt();
		
		sb.append(pre * post -1);
		
		System.out.println(sb);
	}
}
