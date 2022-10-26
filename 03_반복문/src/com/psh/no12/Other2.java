package com.psh.no12;

import java.io.*;

public class Other2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String in;

        while ((in = br.readLine()) != null) {
            int a = in.charAt(0) - 48;
            int b = in.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
