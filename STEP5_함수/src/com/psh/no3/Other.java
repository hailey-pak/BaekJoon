package com.psh.no3;

import java.util.Scanner;

public class Other {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 100) {
            System.out.print(x);
        } else {
            int n = 99;
            for (int i = 100; i <= x; i++) {
                if ( chkNumber(i) ) n++;
            }
            System.out.print(n);
        }
    }

    public static boolean chkNumber(int n) {
        if (n==1000) return false;

        int a = n/100%10;   //100의 자리수
        int b = n/10%10;   //10의 자리수
        int c = n%10;   //1의 자리수

        return a - b == b - c;
    }
}
