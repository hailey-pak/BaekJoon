package com.psh.no2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        int n = Integer.parseInt(s);
        System.out.print(getCons(n, s.length()));
    }

    private static int getCons(int n, int len) {
        for (int i = (n - len * 9); i < n; i++) {
            int sum = i;

            int k = i;
            while (k != 0) {
                sum += k % 10;
                k =  k / 10;
            }

            if (sum == n) {
                return i;
            }
        }
        return 0;
    }
}
