package Main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int brokenString = in.nextInt();
		int brand = in.nextInt();
		
		int minPackage = in.nextInt();
		int minIdividual = in.nextInt();
		
		for (int i = 0; i < brand - 1 ;i++) {
			int inputPackage = in.nextInt();
			int inputIdividual = in.nextInt();
			if (inputPackage < minPackage)
				minPackage = inputPackage;
			if (inputIdividual < minIdividual)
				minIdividual = inputIdividual;
		}
		
		if (minPackage/6 >= minIdividual)
			System.out.println(brokenString * minIdividual);
		else {
			int result = brokenString / 6 * minPackage;
			brokenString %= 6;
			if (brokenString * minIdividual > minPackage) {
				result += minPackage;
			}
			else {
				result += brokenString * minIdividual;
			}
			System.out.println(result);
		}
			
		
		
	}
}
