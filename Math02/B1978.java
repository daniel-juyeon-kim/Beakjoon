package Math02;

import java.util.*;

public class B1978 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		
		for (int min = m;n>=m;m++) {
			int cnt = 0;
			for (int i = 2; m > i; i++) {
				if (m % i == 0) {
					continue;
				}
				else {
					cnt++;
				}
			}
			if (cnt == m-2) {
				System.out.println(m);
			}
			
		}
	}

}
