package com.psh.no2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max=0, n=0;
        for (int i = 0; i < 9; i++) {
           int k = Integer.parseInt(br.readLine());
           if (k >max) {
               max = k;
               n = i+1;
           }
        }
        System.out.print(max +"\n"+ n);
    }
}
