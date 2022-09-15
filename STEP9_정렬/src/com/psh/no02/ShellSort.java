package com.psh.no02;


public class ShellSort {
    private final static int[] gap =
            { 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
            8858, 19930, 44842, 100894, 227011, 510774,
            1149241, 2585792, 5818032, 13090572, 29453787,
            66271020, 149109795, 335497038, 754868335, 1698453753};	// 갭을 담고있는 배열

    /**
     * 셸 정렬
     * 1. 간격(gap)을 설정한다.
     * 2. 각 간격별로 분류 된 서브(부분) 리스트에 대해 삽입정렬을 한다.
     * 3. 각 서브(부분) 리스트의 정렬이 끝나면 간격을 줄인다.
     * 4. 간격이 1이 될 때 까지 2번 과정으로 되돌아가며 반복한다.
     */
    public static void sort(int[] arr) {
        int size = arr.length;
        int index = getGap(size);	// 첫 gap을 사용할 index

        // gap[index] 값부터 gap[0] 까지 반복한다.
        for (int i = index; i >= 0; i--) {

            for (int j = 0; j < gap[i]; j++) {	// 각 부분 리스트에 대해 삽입정렬을 한다.
                insert(arr, j, size, gap[i]);
            }
        }
    }

    // 맨 처음 gap을 참조 할 인덱스를 구하는 메소드
    private static int getGap(int length) {
        int index = 0;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len = (int)(length / 2.25);
        while (gap[index] < len) {
            index++;
        }
        return index;
    }

    /**
     * @param arr	 배열
     * @param start	 부분 배열의 첫 번째 원소 인덱스
     * @param size	 배열의 전체 크기
     * @param gap	 현재 gap
     */
    private static void insert(int[] arr, int start, int size, int gap) {

        // 부분 배열의 두 번째 원소부터 size까지 반복한다. (gap 값씩 건너띔)
        for (int i = start + gap; i < size; i += gap) {

            int target = arr[i];
            int j = i - gap;

            // 타겟 원소가 이전의 원소보다 작을 때 까지 반복
            while (j >= start && target < arr[j]) {
                arr[j + gap] = arr[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
                j -= gap;
            }
            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + gap 에 위치하게 된다.
             */
            arr[j + gap] = target;
        }
    }

    public static void shell_sort(int[] arr) {
        int size = arr.length;

        int index = 0;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len = (int)(size / 2.25);
        while (gap[index] < len) {
            index++;
        }

        //갭이 1이 될 때 까지 반복
        while (index >= 0) {
            int step = gap[index--];    //현재 gap(step)

            /*
             * --- 삽입 정렬 과정 ---
             *
             * 각 부분리스트의 두 번째 원소의 인덱스 부터 순회한다.
             * 예로들어 step이 3일 때 arr[0], arr[1], arr[2] 는
             * 이전 원소와 비교할 것이 없다.
             * 그러므로 step부터 순회한다.
             */
            for(int i = step; i < size; i++) {

                /*
                 *  j는 target 원소가 되며 현재 원소(target) a[j]가 이전 원소 a[j - step]보다
                 *  작을 때 까지 반복한다.
                 */
                for (int j = i; j >= step && arr[j] < arr[j - step]; j -= step) {
                    /*
                     *  현재(target) 원소의 인덱스(j)와 이전의 원소(j-step)의 인덱스에 있는
                     *  원소의 값을 교환한다.
                     */
                    swap(arr, j, j - step);
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
