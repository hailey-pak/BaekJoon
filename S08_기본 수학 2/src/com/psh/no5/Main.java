package com.psh.no5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;
        while ((n = Integer.parseInt(br.readLine()) )!= 0) {
            int cnt = 0;
            for (int i = n+1; i <= 2*n; i++) {
                if (isPrime(i)) cnt++;
            }
            bw.write(cnt+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
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
