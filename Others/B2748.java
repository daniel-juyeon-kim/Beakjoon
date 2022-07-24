package Calculator;

import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    int [] arr = new int [8];

    for (int i = 0 ;i < 8; i++) {
      arr [i] = in.nextInt();
    }

    int a = 0;
    int d = 0;

    for (int i = 0 ;i < 7; i++) {
      if (arr[i] < arr[i+1]) 
        a++;
      if (arr[i] > arr[i+1]) 
        d++;
    }

    if (a == 7)
      System.out.println("ascending");
    else if (d == 7)
      System.out.println("descending");
    else 
      System.out.println("mixed");
    
    
  }
}