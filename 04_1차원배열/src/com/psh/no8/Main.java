package com.psh.no8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] all = new boolean[30];
        for (int i = 0; i < 28; i++) {
            all[Integer.parseInt(br.readLine())-1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!all[i]) System.out.println(i+1);
        }
        br.close();
    }
}
