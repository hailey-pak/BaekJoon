package n2751_수정렬하기_2;


public class ShellSort2 {
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
