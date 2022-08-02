package Main;

import java.util.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		// 필요한 코인개수
		int cnt = 0;
		// 코인의 개수 
		int coin = in.nextInt();
		// 코인의 배열
		int coins [] = new int [coin];
		// 값
		int amount = in.nextInt();
		
		// 코인의 단위 입력
		for (int i = 0; i < coins.length ; i++) {
			coins[i] = in.nextInt();
		}
		// 계산		
		for (int i = coins.length-1; i >= 0 ;i--) {
			cnt += amount / coins[i];
			amount %= coins[i];
		}
		// 출력
		System.out.println(cnt);
	}

}
