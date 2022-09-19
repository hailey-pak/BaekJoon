package com.psh.no10;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /**
     *  실패 --> 안정 정렬이 아니기 때문
     *  Arrays.sort()의 경우 dual-pivot Quicksort 알고리즘을 사용 -> 안정성 보장 못함
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] members = new String[n][2];

        for (int i = 0; i < n; i++) {
            members[i] = br.readLine().split(" ");
        }

        Arrays.sort(members, Comparator.comparing(o -> o[0]));

        for (String[] mem : members) {
            bw.write(mem[0] + " " + mem[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
