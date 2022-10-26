package com.psh.no13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n, cnt=0;

        while (true) {
            int sum = x/10 + x%10;
            x = x%10*10 + sum%10;
            cnt++;
            if (x==n)  break;
        }
        System.out.print(cnt);
    }
}
