package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		StringBuilder sb = new StringBuilder ();
		int testcase = in.nextInt();
		
		ArrayList <String> list1 = new ArrayList <>();
		ArrayList <String> list2 = new ArrayList <>();
		
		for (int i = 0 ; i < testcase;i++) {
			String str1 = in.next();
			String str2 = in.next();
			if (str1.length() != str2.length())
				sb.append(str1 + " & " + str2 + " are NOT anagrams.\n");
			else {
				for (int j = 0 ;j < str1.length();j++) {
					list1.add(Character.toString(str1.charAt(j)));
					list2.add(Character.toString(str2.charAt(j)));
				}
				Collections.sort(list1);
				Collections.sort(list2);
				if (list1.equals(list2))
					sb.append(str1 + " & " + str2 + " are anagrams.\n");
				else
					sb.append(str1 + " & " + str2 + " are NOT anagrams.\n");
			}
		}
		System.out.println(sb);
	}
}
