package com.psh.no2;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.print(a<60?"F":a<70?"D":a<80?"C":a<90?"B":"A");
    }
}
