package com.psh.no10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] members = new String[n][2];

        for (int i = 0; i < n; i++) {
            members[i] = br.readLine().split(" ");
        }

        Arrays.sort(members, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        for (String[] mem : members) {
            bw.write(mem[0] + " " + mem[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
