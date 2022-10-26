package com.psh.no3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n>1) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            while (n>1) {
                for (int i = 2; i <= n; i++) {
                    if (n%i == 0) {
                        bw.write(i+"\n");
                        n = n/i;
                        break;
                    }
                }
            }
            bw.flush();
            bw.close();
        }
    }
}
