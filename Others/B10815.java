package Main;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		StringBuilder sb = new StringBuilder ();
		
		int testcase = in.nextInt();
		
		ArrayList <Integer> list = new ArrayList<>();
		ArrayList <Integer> compareList = new ArrayList<>();
		
		for (int i = 0 ; i < testcase ;i++) {
			list.add(in.nextInt());
		}
		
		
		Collections.sort(list);

		int compareTestcase = in.nextInt();
		
		for (int i = 0 ; i < compareTestcase ;i++) {
			compareList.add(in.nextInt());
		}

		for (int i = 0 ; i < compareTestcase ;i++) {
			if (binSearchListIndex (list, compareList.get(i)) == -1)
				sb.append(0+" ");
			else
				sb.append(1+" ");
		}
		
		System.out.println(sb);
		
	}
	static int binSearchListIndex (ArrayList <Integer> list , int value) {
		
		int startIndex = 0;
		int endIndex = list.size() - 1;
		
		while (startIndex <= endIndex) {
			int mid = (startIndex + endIndex) /2;
			
			if (value > list.get(mid)) 
				startIndex = mid +1;
			
			else if (value < list.get(mid)) 
				endIndex = mid -1;
			
			else 
				return mid;
		}
		return -1;
	}
	
 }