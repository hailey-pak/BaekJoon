package com.psh.no05;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(getAverage(arr)+"\n");
        bw.write(getMedian(arr)+"\n");
        bw.write(getMode(arr)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    //산술평균 출력 - 소수점 이하 첫째 자리에서 반올림
    private static int getAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double)sum / arr.length;
        return (int) Math.round(avg);
    }

    //중앙값 출력
    private static int getMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    //최빈값 출력 - 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값 출력
    private static int getMode(int[] arr) {
        int max = 0;


        return max;
    }

    //범위 출력
    private static int getRange() {
        int val = 0;

        return val;
    }
}
