package com.psh.no04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            sum += Integer.parseInt(in[0]) * Integer.parseInt(in[1]);
        }

        System.out.print(x==sum?"Yes":"No");
        br.close();
    }
}
