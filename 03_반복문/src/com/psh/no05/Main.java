package com.psh.no05;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] in = br.readLine().split(" ");
            bw.write(String.valueOf(Integer.parseInt(in[0]) + Integer.parseInt(in[1])));
            if (i!=t-1) bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
