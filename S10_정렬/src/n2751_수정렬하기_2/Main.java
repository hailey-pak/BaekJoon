package n2751_수정렬하기_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //Arrays.sort(arr);     // 118780KB : 1572ms
        MergeSort.sort(arr);    //병합정렬 110820KB : 980ms
//        HeapSort.sort(arr);     //힙정렬 - 힙 자료구조 이용 136252KB : 1448ms
//        HeapSort2.sort(arr);    //힙정렬 106720KB : 1004ms
//        ShellSort.sort(arr);    //셸정렬 107592KB : 1024ms
//        ShellSort2.sort(arr);    //셸정렬 106344KB : 988ms
//        QuickSort.sort(arr);    //시간초과

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
