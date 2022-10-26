package com.psh.no1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        String[] in = br.readLine().split(" ");
        for (String s : in) {
            int k = Integer.parseInt(s);
            if (isPrime(k)) sum++;
        }
        System.out.print(sum);
    }

    private static boolean isPrime(int k) {
        if (k==1) return false;

        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
