package com.psh.no2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0, min = b;
        for (int i = a; i <= b ; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min > i) min = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (sum != 0) {
            bw.write(sum + "\n" + min);
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
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
