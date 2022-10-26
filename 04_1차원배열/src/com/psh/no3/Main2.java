package com.psh.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*   문제 구분이 1차원 배열인데 처음 풀이를 배열을 활용안해서 다시 풀이
* */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mods = new int[10];
        for (int i = 0; i < 10; i++) {
            mods[i] = Integer.parseInt(br.readLine())%42;
        }
        int n = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = 0;
            for (int j = i+1; j < 10; j++) {
                if (mods[i]==mods[j]) {
                    tmp++;
                }
            }
            if(tmp==0) n++;
        }

        System.out.print(n);
    }
}
