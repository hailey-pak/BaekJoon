package com.psh.no7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Other {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = Integer.parseInt(in[2]);
        int sum;

        if (a==b && b==c) {
            sum = 10000 + a*1000;
        } else if (a==b || b==c) {
            sum = 1000 + b*100;
        } else if (a==c) {
            sum = 1000 + a*100;
        } else {
            sum = Math.max(Math.max(a,b), c)*100;
        }

        System.out.print(sum);
        br.close();
    }
}
