package com.psh.no5;

import java.io.*;

public class Other {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] in = br.readLine().split(" ");
            int H = Integer.parseInt(in[0]);        //호텔의 층 수
            int N = Integer.parseInt(in[2]) -1;    //몇번째 손님인지

            bw.write((N%H+1)*100 + (N/H+1) +"\n");
        }
        bw.flush();
        bw.close();
    }
}
