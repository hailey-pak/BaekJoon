package com.psh.no3;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), i = 2;

        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            while (n%i == 0) {
                sb.append(i).append("\n");
                n = n/i;
            }
            i++;
        }
        System.out.print(sb);
    }
}
