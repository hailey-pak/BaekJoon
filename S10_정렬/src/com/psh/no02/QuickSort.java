package com.psh.no02;

public class QuickSort {

    /**
     * 퀵 정렬
     * 1. 피벗을 하나 선택한다.
     * 2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다. 왼쪽에서부터는 피벗보다 큰 값을 찾고, 오른쪽에서부터는 피벗보다 작은 값을 찾는다.
     * 3. 양 방향에서 찾은 두 원소를 교환한다.
     * 4. 왼쪽에서 탐색하는 위치와 오른쪽에서 탐색하는 위치가 엇갈리지 않을 때 까지 2번으로 돌아가 위 과정을 반복한다.
     * 5. 엇갈린 기점을 기준으로 두 개의 부분리스트로 나누어 1번으로 돌아가 해당 부분리스트의 길이가 1이 아닐 때 까지 1번 과정을 반복한다. (Divide : 분할)
     * 6. 인접한 부분리스트끼리 합친다.
     */
    public static void sort(int[] arr) {
        l_pivot_sort(arr, 0, arr.length - 1);
    }

    /**
     * 왼쪽 피벗 선택 방식
     * @param arr   정렬 할 배열
     * @param l     현재 부분배열의 왼쪽
     * @param r     현재 부분배열의 오른쪽
     */
    private static void l_pivot_sort(int[] arr, int l, int r) {

        if (l >= r) return;     //l이 r보다 크거나 같다면 정렬 할 원소가 1개이므로 return

        /*
		 * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
		 * 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
		 *
		 * 그리고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
		 * 분할 정복을 해준다.
		 *
         */
        int pivot = partition(arr, l, r);

        l_pivot_sort(arr, l, pivot - 1);
        l_pivot_sort(arr, pivot + 1, r);
    }

    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     * @param arr   정렬 할 배열
     * @param l     현재 배열의 가장 왼쪽 부분
     * @param r     현재 배열의 가장 오른쪽 부분
     * @return      최종적으로 위치한 피벗의 위치를 반환
     */
    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];		    // 부분리스트의 왼쪽 요소를 피벗으로 설정
        int pivotIndex = l;

        while (l < r) {

            //r이 l보다 크면서 r의 요소가 pivot보다 작거나 같은 원소를 찾을 때까지 r을 감소 시킨다.
            while (arr[r] > pivot && l < r) {
                r--;
            }

            //r이 l보다 크면서 l의 요소가 pivot보다 큰 원소를 찾을 때까지 l을 증가 시킨다.
            while (arr[l] <= pivot && l < r) {
                l++;
            }

            //교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(arr, l, r);
        }
        //마지막으로 맨 처음 pivot으로 설정했던 위치 a[l]의 원소와 l이 가리키는 원소를 바꾼다.
        swap(arr, pivotIndex, l);

        //두 요소가 교환되었다면 피벗이었던 요소는 l에 위치하므로 l을 반환한다.
        return l;
    }


    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
