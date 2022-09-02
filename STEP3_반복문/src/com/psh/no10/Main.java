package com.psh.no10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]), x = Integer.parseInt(in[1]);

        String[] arrays = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if ( Integer.parseInt(arrays[i]) < x ) {
                bw.write(arrays[i]);
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
