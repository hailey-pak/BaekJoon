package n24060_알고리즘수업_병합정렬_1;

import java.io.*;

public class Main {
    static int[] A, tmp;
    static int cnt = 0;
    static int result = -1;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        k = Integer.parseInt(in[1]);

        A = new int[n];
        tmp = new int[n];

        in = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(in[i]);
        }

        merge_sort(A, 0, n-1);
        System.out.print(result);
        br.close();

    }


    // A[p..r]을 오름차순 정렬한다.
    public static void merge_sort(int[] A, int p, int r){
        if (cnt > k) return;
        if (p < r) {
            int q = (p + r) / 2;        //q는 p, r의 중간 지점
            merge_sort(A, p, q);        //전반부 정렬
            merge_sort(A, q+1, r);   //후반부 정렬
            merge(A, p, q, r);          //병합
        }
    }


    // A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
    // A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
    public static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        //왼쪽 배열 부분이 남을 경우
        while (i <= q) tmp[t++] = A[i++];

        //오른쪽 배열 부분이 남을 경우
        while (j <= r) tmp[t++] = A[j++];

        //결과를 A[p..r]에 저장
        i = p;
        t = 0;
        while (i <= r) {
            cnt++;
            if (cnt == k) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
}
