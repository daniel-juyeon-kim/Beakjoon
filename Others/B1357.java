package Main;

import java.util.*;
import java.math.*;

public class Main {
	// 반복되는 부분이 있으므로 함수 이
	static int Rev (int x) {
		int result = 0;
		
		String str = String.valueOf(x);
		
		for (int i = 0;i < str.length();i++) {
			result += Character.getNumericValue(str.charAt(i)) * Math.pow(10 ,i);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		// 입
		int pre = in.nextInt();
		int post = in.nextInt();
	
		
		System.out.println(Rev(Rev(pre) + Rev(post)));
	}

}
