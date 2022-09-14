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

        insertionSort(arr);

//        for (int i = 0; i < n-1; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    /**
     * 선택정렬
     * @param arr 정수배열
     */
    public static void selectionSort(int[] arr) {
        int min, tmp;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    /**
     * 삽입정렬
     * @param arr 정수배열
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i - 1;
            //타겟이 이전 원소보다 크기 전까지 반복
            while (j >= 0 && target < arr[j]) {
                arr[j+1] = arr[j];    //이전 원소를 한 칸씩 뒤로 미룸
                j--;
            }
            arr[j+1] = target;
        }
    }

    /**
     * 거품정렬
     * @param arr 정수배열
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
