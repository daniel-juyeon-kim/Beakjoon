import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // n번째 수 입력
    int n = in.nextInt();

    // 결과값을 저장하는 변수 선언
    int result = 0;
    
    //Fn-2 
    int first = 0;
    // Fn-1 
    int second = 1;
    

    // n이 0과 1인 경우를 제외한 나머지는 Fn = Fn-1 + Fn-2 이므로 else문 실행
    for (int i = 0 ;i < n; i++) {
      if (n == 0)
        break;
      if (i == 1)
        result = 1;
      else {
        result = first + second;
        first = second;
        second = result;  
      }  
    }
    // 출력
    System.out.println(result); 
  }
}