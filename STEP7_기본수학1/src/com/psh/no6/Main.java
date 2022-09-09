package com.psh.no6;

import java.io.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        make_APT();	// 아파트 만들기 
        
        int T = parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(APT[k][n]+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static void make_APT() {
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; // i층 1호
            APT[0][i] = i; // 0층 i호
        }

        for (int i = 1; i < 15; i++) { // 1층부터 14층까지

            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }
    }
}
