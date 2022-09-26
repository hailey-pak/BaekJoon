package com.psh.no1;

import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(s[i]));
        }

        int m = Integer.parseInt(br.readLine());
        s = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(s[i]);
            if (set.contains(k)) {
                bw.write("1 " );
            } else {
                bw.write("0 " );
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
