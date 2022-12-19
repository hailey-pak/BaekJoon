package com.psh.no06;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");
        int[] n = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Integer[] i = Arrays.stream(n).boxed().toArray(Integer[]::new);
        Arrays.sort(i, Comparator.reverseOrder());

        for (Integer in : i) {
            bw.write(in.toString());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
