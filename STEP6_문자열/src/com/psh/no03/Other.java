package com.psh.no03;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        int i = 97;
        while (i<123) {
            System.out.print(S.indexOf(i++)+" ");
        }
    }
}
