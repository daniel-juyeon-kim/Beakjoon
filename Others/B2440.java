package Main;

import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int line = in.nextInt();
		
		for (int i =0 ; i < line;i++) {
			for (int j = line ;j > i;j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
