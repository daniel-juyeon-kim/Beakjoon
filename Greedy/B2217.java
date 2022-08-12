package Main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		StringBuilder sb = new StringBuilder ();
		
		int testcase = in.nextInt();
		
		
		ArrayList <Integer> list = new ArrayList <> ();
		
		// input
		for (int i = 0; i < testcase ;i++) {
			list.add(in.nextInt());
		}
		
		Collections.sort(list);

		Collections.reverse(list);
		
		int max = list.get(0);
		
		int min = 0;
		// 10 9 8 7 6
//		*
//		**
//		***
		for (int i = 0 ; i < list.size(); i++) {
			int sum = 0;
			sum = list.get(i) * (i + 1);
			if (sum > max) 
				max = sum;
			else 
				continue;
		}
		System.out.println(max);
		
		
	}
	
 }