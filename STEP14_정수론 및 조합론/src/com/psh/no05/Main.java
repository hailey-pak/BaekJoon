package com.psh.no05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);

        int val = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            val = gcd(val, arr[i] - arr[i-1]);
        }

        for (int i = 2; i <= val ; i++) {
           if (val % i == 0) sb.append(i).append(" ");
        }
        System.out.print(sb);
        br.close();
    }

    static int gcd(int a, int b) {
        int n;
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}
