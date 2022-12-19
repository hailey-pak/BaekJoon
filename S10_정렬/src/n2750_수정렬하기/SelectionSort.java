package n2750_수정렬하기;

public class SelectionSort {
    /**
     * 선택 정렬
     *
     * 1. 주어진 리스트에서 최솟값을 찾는다.
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다.
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     */
    public static void sort(int[] arr) {
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
}
