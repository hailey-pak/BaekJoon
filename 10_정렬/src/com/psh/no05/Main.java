package com.psh.no05;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        //평균
        int avg = (int) Math.round( (double)sum / arr.length );
        bw.write(avg + "\n");

        //중앙값
        Arrays.sort(arr);
        int median =  arr[arr.length/2];
        bw.write(median + "\n");

        //최빈값
        int cnt = 0, max = -1, mode = arr[0];
        boolean chk = false;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (cnt > max) {
               max = cnt;
               mode = arr[i];
               chk = true;
            } else if (cnt == max && chk) {
                mode = arr[i];
                chk = false;
            }
        }
        bw.write(mode + "\n");

        //범위
        int range = arr[n-1] - arr[0];
        bw.write(String.valueOf(range));

        bw.flush();
        bw.close();
        br.close();
    }
}
