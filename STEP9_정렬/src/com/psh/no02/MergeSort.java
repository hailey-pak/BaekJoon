package com.psh.no02;

public class MergeSort {
    private static int[] sorted;    //합치는 과정에서 정렬하여 원소를 담을 임시배열

    /**
     * 병합 정렬 (합병 정렬)
     * 1. 주어진 리스트를 절반으로 분할하여 부분리스트로 나눈다. (Divide : 분할)
     * 2. 해당 부분리스트의 길이가 1이 아니라면 1번 과정을 되풀이한다.
     * 3. 인접한 부분리스트끼리 정렬하여 합친다. (Conqure : 정복
     */
    public static void sort(int[] a) {
        sorted = new int[a.length];
        //   sort_top(a, 0, a.length-1);
        sort_bottom(a, 0, a.length - 1);
        sorted = null;
    }

    // Top-Down 방식 구현
    private static void sort_top(int[] a, int left, int right) {

        //부분리스트가 1개의 원소만 갖고있는 경우 더이상 쪼갤 수 없으므로 return한다.
        if (left == right) return;

        int mid = (left + right) / 2;   //절반 위치

        sort_top(a, left, mid);           //절반 중 왼쪽 부분리스트(left ~ mid)
        sort_top(a, mid + 1, right);    //절반 중 오른쪽 부분리스트(mid+1 ~ right)

        merge(a, left, mid, right);     //병합작업
    }

    // Bottom-Up 방식 구현
    private static void sort_bottom(int[] a, int left, int right) {

        //1 - 2 - 4 - 8 - ... 식으로 1부터 서브리스트를 나누는 기준을 두 배씩 늘린다.
        for (int size = 1; size <= right; size += size) {
            /*
             * 두 부분리스트을 순서대로 병합해준다.
             * 예로들어 현재 부분리스트의 크기가 1(size=1)일 때
             * 왼쪽 부분리스트(low ~ mid)와 오른쪽 부분리스트(mid + 1 ~ high)를 생각하면
             * 왼쪽 부분리스트는 low = mid = 0 이고,
             * 오른쪽 부분리스트는 mid + 1부터 low + (2 * size) - 1 = 1 이 된다.
             *
             * 이 때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이
             * 병합되도록 해야한다.
             */
            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                merge(a, low, mid, high);        // 병합작업
            }
        }
    }

    /**
     * 합칠 부분리스트는 a배열의 left ~ right 까지이다.
     *
     * @param a     정렬할 배열
     * @param left  배열의 시작점
     * @param mid   배열의 중간점
     * @param right 배열의 끝점
     */
    private static void merge(int[] a, int left, int mid, int right) {
        int l = left;        // 왼쪽 부분리스트 시작점
        int r = mid + 1;    // 오른쪽 부분리스트의 시작점
        int idx = left;        // 채워넣을 배열의 인덱스

        // 왼쪽 시작점이 중간점 이하이거나 오른쪽 시작점이 끝점보다 작을 때 작동
        while (l <= mid || r <= right) {
            /*
             *   왼쪽 분할에서 원소를 가져오는 경우
             *   1. 오른쪽 분할의 원소를 이미 다 가져온 경우 (r > end)
             *   2. 왼쪽 분할에서 가져오지 않은 원소가 있고, 왼쪽 분할의 첫 원소 값이 오른쪽 분할의 첫 원소 값보다 작은 경우
             */
            if (r > right || (l <= mid && a[l] < a[r])) {
                sorted[idx++] = a[l++];

            /*
             *  그 이외의 경우에는 오른쪽 분할에서 원소를 가져옴
             */
            } else {
                sorted[idx++] = a[r++];
            }
        }

        /*
         * 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
         */
        for (int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }
}
