package com.psh.no11;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int c; (c = (s.nextInt() + s.nextInt())) != 0; ) {
            System.out.println(c);
        }
    }
}
