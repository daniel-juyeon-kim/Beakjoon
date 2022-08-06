package Main;

import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder ();
	
		int testcase = in.nextInt();
		
		int arr [] = new int [testcase];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		
		for (int i = 1; i < arr.length; i++) {
			int divMaxValue = 0;
			
			for (int j = 2;j <= arr[0];j++) {
				if (arr[0] % j == 0 && arr[i] % j == 0) 
					divMaxValue = j;
			}
			if (divMaxValue == 0)
				sb.append(arr[0] + "/" + arr[i] + "\n");
			else 
				sb.append(arr[0]/divMaxValue + "/" + arr[i]/divMaxValue + "\n");
		
		}
		System.out.println(sb);
	}
}
