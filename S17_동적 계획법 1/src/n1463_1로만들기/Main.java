package n1463_1로만들기;

import java.util.Scanner;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) {

        int N = new Scanner(System.in).nextInt();

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(cal(N));
    }

    static int cal(int x) {
        if (dp[x] == null) {

            if (x % 6 == 0) {
                dp[x] = Math.min(cal(x - 1), Math.min(cal(x / 3), cal(x / 2))) + 1;
            }
            else if (x % 3 == 0) {
                dp[x] = Math.min(cal(x / 3), cal(x - 1)) + 1;
            }
            else if (x % 2 == 0) {
                dp[x] = Math.min(cal(x / 2), cal(x - 1)) + 1;
            }
            else {
                dp[x] = cal(x - 1) + 1;
            }
        }
        return dp[x];
    }
}
