package com.psh.no2;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = 1;
        while(a > 1) {
            a -= 6*b++;
        }
        System.out.print(b);
    }
}
