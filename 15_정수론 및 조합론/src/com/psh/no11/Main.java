package com.psh.no11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int cnt = 0;
        while (n >= 5) {
            cnt += n / 5;
            n = n / 5;
        }
        System.out.println(cnt);
    }
}
