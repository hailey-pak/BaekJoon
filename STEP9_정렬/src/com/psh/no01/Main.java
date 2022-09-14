package com.psh.no01;

import java.io.*;

/*
*   이중 for문으로 배열 앞에부터 비교해서 순서 바꾸기
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
