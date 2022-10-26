package com.psh.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        int out = 1;
        if (a>0 && b<0) {
            out = 4;
        } else if (a<0 && b>0) {
            out = 2;
        } else if (a<0 && b<0) {
            out = 3;
        }
        System.out.print(out);
    }
}
