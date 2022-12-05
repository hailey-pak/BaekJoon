package n15649_N과M_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int[] arr;
    static boolean[] visited;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        visited = new boolean[arr.length];
        combination(arr, visited, 0, n, m);

        bw.flush();
        bw.close();

    }


    static void combination(int[] arr, boolean[] visited, int start, int n, int r) throws IOException {
        if (r == 0) {
            for (int i = 0; i < arr.length; i++) {
                if(visited[i]) {
                    bw.write(arr[i] + " ");
                }
            }
            bw.newLine();
            return;
        } else {
            for (int i = start; i < n; i++) {
                visited[i] = true;
                combination(arr, visited, i+1, n, r-1);
                visited[i] = false;
            }
        }
    }



}
