package n2750_수정렬하기;

public class InsertionSort {
    /**
     * 삽입 정렬
     * 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법이다.
     *
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
     * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */
    public static void sort(int[] arr) {
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
}
