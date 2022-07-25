package Calculator;

import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int testcase = in.nextInt();
		
		String str [] = new String [testcase];
		
		for (int i = 0 ; i < str.length; i++ ) {
			str[i] = in.next();
		}
		
		for (int i = 0 ; i < str.length; i++ ) {
			System.out.println(Integer.parseInt(String.valueOf(str[i].charAt(0)))
					+ Integer.parseInt(String.valueOf(str[i].charAt(2))));
		}

	}
}
