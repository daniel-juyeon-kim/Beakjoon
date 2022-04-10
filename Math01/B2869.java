import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        // 문제 : https://www.acmicpc.net/problem/2869
        // 알고리즘 설명 :
        // 단순 반복문을 이용하여 문제 풀이가 가능하지만 문제의 시간제한 때문에 기본적인 계산으로 풀어야 한다.

        Scanner in = new Scanner(System.in);

        // 하루에 올라가는 거리
        int a = in.nextInt();
        // 하루에 내려가는 거리
        int b = in.nextInt();
        // 올라가야 하는 총 거리
        int v = in.nextInt();

        // v-a는 올라가야하는 총 거리에서 하루동안 올라가는 거리이고 a-b는 하루에 올라가고 내려가는 거리를 합한 거리이다.
        // 총 거리에서 하루치를 빼고 나중 계산시 1을 더해주고
        // 총 거리에서 하루치를 뺀 수를 a-b로 나누어 준다.
        // 그러면 두가지 경우가 생기는데 나머지가 0 인경우 0 보다 큰 경우이다.
        // 0 보다 큰 경우 1대신 2를 더해준다.

        if ((v-a)%(a-b) == 0){
            System.out.println((v-a)/(a-b)+1);
        }
        else if ((v-a)%(a-b)>0) {
            System.out.println((v-a)/(a-b)+2);
        }

    }
}