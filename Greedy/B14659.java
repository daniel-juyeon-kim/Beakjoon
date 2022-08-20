package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		StringBuilder sb = new StringBuilder ();
		int testcase = in.nextInt();
		
		int arr [] = new int [testcase];
		
		int cnt = 0;
		int saveValue = arr[0];
		
		ArrayList <Integer> list = new ArrayList<>();
		
		for (int i = 0 ; i < arr.length;i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0 ; i < arr.length;i++) {
			if (saveValue > arr[i]) {
				cnt++;
			}
			else {
				saveValue = arr[i];
				list.add(cnt);
				cnt = 0;
			}
		}
		list.add(cnt);
		int max = 0;
		for (int i = 0 ; i < list.size()-1;i++) {
			if (list.get(i) < list.get(i+1)) {
				max = list.get(i+1);
				
			}
		}
		System.out.println(max);
	}
}
