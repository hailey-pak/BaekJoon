package com.psh.no03;

import java.io.*;

public class CountingSort {
    /**
     * 카운팅 정렬
     * 시간 복잡도가 빠른 대신 배열의 크기에 따라 메모리가 많이 낭비 됨.
     * 1. 정렬할 배열을 한 번 순회하면서 해당 값을 index로 하는 새로운 배열(counting)의 값을 1 증가
     * 2. counting 배열의 각 값을 누적합으로 변환
     * 3. 원래 배열의 마지막 index부터 순회하면서 해당하는 값을 counting배열의 index로 찾아 해당 값의 -1 위치에 배정
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            arr[i] = k;
            max = Math.max(max, k);
        }

        int[] sorted = new int[n];
        int[] counting = new int[max+1];

        // array 의 value 값을 index 로 하는 counting 배열 값 1 증가
        for (int i = 0; i < n; i++) {
            counting[arr[i]]++;
        }

        // 누적 합 해주기
        for (int i = 1; i < max+1; i++) {
            counting[i] += counting[i-1];
        }

        /*
         *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
         *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
         */
        for (int i = n-1; i >= 0; i--) {
            int val = arr[i];
            counting[val]--;
            sorted[counting[val]] = val;
        }

        for (int i : sorted) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
