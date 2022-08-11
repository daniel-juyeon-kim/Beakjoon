package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String str = in.next();
		
		int result = 0;
		
		int startIndex = 0;
		
		Loop :
		for (int i = 0; i < str.length();i++) {
			if (str.charAt(i) == '-') {
				if (startIndex == 0) {
					// 초기값 지정
					result += add (str.substring(startIndex, i));
					startIndex = i + 1;
				}
				for (int j = startIndex + 1; j < str.length(); j++) {
					if (str.charAt(startIndex - 1) == '-' && str.charAt(j) == '-') {
						result -= add (str.substring(startIndex, j));
						startIndex = j + 1;
					}
					else if (i == str.length() -1) {
						result -= add (str.substring(startIndex, i + 1)); 
						break Loop;
					}
				}
			}

			else if (i == str.length() -1) {
				if (startIndex > 0) {
					result -= add (str.substring(startIndex , i + 1)); 
					break;
				}
				if (startIndex == 0) {
					result += add (str.substring(startIndex, i + 1));
					break;
				}
			}
		}
		System.out.println(result);
	}
	static int add (String str) {
		int result = 0;
		int startIndex = 0;
		for (int i = 0; i < str.length();i++) {
			if (str.charAt(i) == '+') {
				result += Integer.parseInt(str.substring(startIndex, i));
				startIndex = i + 1;
			}
			else if (i == str.length()-1) {
				result += Integer.parseInt(str.substring(startIndex, str.length()));
			}
		}
		
		return result;
	}
	
	
 }
