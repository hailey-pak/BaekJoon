package com.psh.no3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);   //몸무게
            arr[i][1] = Integer.parseInt(str[1]);   //키
        }

        for (int i = 0; i < n; i++) {
            int r = 1;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    r++;
                }
            }
            bw.write(r + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
