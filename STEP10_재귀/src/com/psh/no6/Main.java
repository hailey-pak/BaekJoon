package com.psh.no6;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        for (int i = n; i >=1 ; i--) {
            st1.push(i);
        }

    }
}
