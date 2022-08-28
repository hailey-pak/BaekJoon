package com.psh.no3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.print(a%4==0?a%100!=0||a%400==0?"1":"0":"0");
    }
}
