package com.psh.no11;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]), b = Integer.parseInt(in[1]);
            if(a==0 && b==0) break;

            bw.write(a+b +"\n");
        }
        bw.flush();
        bw.close();
    }
}
