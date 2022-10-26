package com.psh.no01;

public class BubbleSort {
    /**
     * 거품정렬
     * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
     * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
     * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
