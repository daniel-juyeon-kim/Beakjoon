import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    // 입력을 받게될 크기가 8인 정수형 배열 선언
    int [] arr = new int [8];

    // 배열에 수 입력 
    for (int i = 0 ;i < 8; i++) {
      arr [i] = in.nextInt();
    }
    
    // ascending인지 descending인지 mixed인지 판별하기 위한 변수 선언
    int a = 0;
    int d = 0;

    // 배열의 길이만큼 반복하여 배열의 값을 비교 후 카운트
    for (int i = 0 ;i < 7; i++) {
      if (arr[i] < arr[i+1]) 
        a++;
      if (arr[i] > arr[i+1]) 
        d++;
    }

    // 만약 순서대로 입력한 경우 ascending
    if (a == 7)
      System.out.println("ascending");
    // 반대 순서대로인 경우 descending
    else if (d == 7)
      System.out.println("descending");
    // 둘다 아니면 mixed
    else 
      System.out.println("mixed");
  }
}