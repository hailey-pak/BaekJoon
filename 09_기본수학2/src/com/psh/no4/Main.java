package com.psh.no4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");

        int m = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);

        for (int i = m; i <= n ; i++) {
            if (isPrime(i)) bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrime(int k) {
        if (k==1) return false;

        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0)  return false;
        }
        return true;
    }
}
