package com.psh.no2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n >= 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return n;
        }
    }
}
