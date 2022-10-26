package com.psh.no06;

import java.io.*;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("");
        Arrays.sort(s);
        for (int i = s.length - 1; i >= 0; i--) {
            bw.write(s[i]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
