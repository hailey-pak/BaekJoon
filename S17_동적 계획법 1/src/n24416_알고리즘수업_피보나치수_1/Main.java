package n24416_알고리즘수업_피보나치수_1;

import java.util.Scanner;

public class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        fib(n);
        fibonacci(n);
        System.out.print(cnt1 + " " + cnt2);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n) {
        int[] f = new int[n+1];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            cnt2++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
