package com.psh.no07;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
        }
    }
}
