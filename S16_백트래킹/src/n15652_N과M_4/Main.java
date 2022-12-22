package n15652_N과M_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);

        arr = new int[m];
        dfs(0, 0);
        System.out.println(sb);
    }

    static void dfs(int depth, int idx){
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = idx; i < n; i++) {
            arr[depth] = i + 1;
            dfs(depth + 1, i);
        }
    }
}
