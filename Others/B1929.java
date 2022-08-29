package Main;

import java.util.Scanner;

public class Main {
	public static StringBuilder sb = new StringBuilder ();
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);

		int pre = in.nextInt();
		int post = in.nextInt();
		
		for (int start = pre ;start <= post;start++) {
			find(start);
		}
		System.out.println(sb);
	}
	
	static void find (int value) {

		if (value < 2) {
			return;
		}
		
		else if (value == 2) {
			sb.append(2+"\n");
			return;
		}
		
		for (int i = 2 ; i <= Math.sqrt(value);i++) {
			if (value % i == 0) {
				return;
			}
		}
		
		sb.append(value+"\n");
		return;
	}
}