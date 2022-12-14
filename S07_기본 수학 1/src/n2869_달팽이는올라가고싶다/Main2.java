package n2869_달팽이는올라가고싶다;

import java.util.Scanner;
/*
*   답은 틀리지 않으나, 시간 초과로 실패
*
* */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();     //낮에 올라가는 거리
        int B = scan.nextInt();     //밤에 떨어지는 거리
        int V = scan.nextInt();     //나무높이

        int sum = 0, n = 0;
        while (sum < V) {
            n++;
            sum += A;
            if (sum >= V) {
                break;
            }
            sum -= B;
        }
        System.out.print(n);
    }
}
