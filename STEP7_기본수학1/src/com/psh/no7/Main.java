package com.psh.no7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.print(getCount(n));
    }

    private static int getCount(int n) {
        if (n == 4 || n == 7) {
            return -1;
        }
         else if (n%5 == 0) {
             return n/5;
        }
         else if (n%5 == 1 || n%5 == 3) {
             return (n/5) + 1;
        }
         else {
             return (n/5) +2;
        }
    }
}
