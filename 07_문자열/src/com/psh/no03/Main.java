package com.psh.no03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String find = "abcdefghijklmnopqrstuvwxyz";
        String word = new Scanner(System.in).next();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < find.length(); i++) {
            int n = word.indexOf(find.charAt(i));
            sb.append(n).append(" ");
        }
        System.out.print(sb);
    }
}
