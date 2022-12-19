package n2750_수정렬하기;

import java.io.*;
import java.util.Arrays;

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

        Arrays.sort(arr);

//        BubbleSort.sort(arr);     //거품정렬
//        SelectionSort.sort(arr);    //선택정렬
//        InsertionSort.sort(arr);    //삽입정렬

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
