package Main;

import java.util.*;
import java.math.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		String str = in.next();
		
		while (str.length() >= 10) {
			sb.append(str.substring(0, 10) + "\n");
			str = str.substring(10);
		}
		sb.append(str);
		
		System.out.println(sb);
	}
}
