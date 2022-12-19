package n2751_수정렬하기_2;

import java.util.PriorityQueue;

/**
 * 코드는 간단하나 성능에서는 떨어짐
 */
public class HeapSort {

    /**
     * 힙 정렬
     * 힙 자료구조를 통해 저장한 뒤 반환
     */
    public static void sort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 배열을 힙으로
        for (int j : arr) {
            heap.add(j);
        }
        
        // 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 뽑기
        for (int i = 0; i < arr.length; i++) {
            if (heap.isEmpty()) continue;
            arr[i] = heap.poll();
        }
    }
}
