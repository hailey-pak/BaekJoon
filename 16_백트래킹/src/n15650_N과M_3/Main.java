package n15650_N과M_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        arr = new int[m];
        dfs(n, m, 0);
        System.out.println(sb);

    }

    static void dfs(int n, int m, int depth){
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            dfs(n, m, depth + 1);
        }
    }
}
