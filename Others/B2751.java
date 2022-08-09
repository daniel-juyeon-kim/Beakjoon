package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder ();
	
		int n = in.nextInt();
	
		ArrayList<Integer> list = new ArrayList <> ();
		
		for (int i = 0 ;i< n; i++) {
			int value = in.nextInt();
			list.add(value);
		}
		
		Collections.sort(list);
		
		for (int i = 0 ;i< n; i++) {
			sb.append(list.get(i) + "\n");
		}
		
		System.out.println(sb);
		
	}
}
