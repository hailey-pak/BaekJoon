package com.psh.no3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if ( (a%4==0 && a%100!=0) || a%400==0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
