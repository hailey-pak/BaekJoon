package n11729_하노이탑이동순서;

import java.util.Scanner;

public class Main {
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int k = (int) (Math.pow(2, n) - 1);
        sb.append(k).append("\n");
        hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    /**
     * @param n     옮길 원판의 개수
     * @param a     시작 지점
     * @param b     중간 지점
     * @param c     도착 지점
     */
    public static void hanoi(int n, int a, int b, int c) {

        if (n == 1) {
            sb.append(a).append(" ").append(c).append("\n");
            return;
        }

        //n-1개 원판을 a->b로 이동
        hanoi(n-1, a, c, b);

        //가장 밑의 원판을 a->c로 이동
        sb.append(a).append(" ").append(c).append("\n");

        //n-1개의 원판을 b->c로 이동
        hanoi(n-1, b, a, c);
    }
}
