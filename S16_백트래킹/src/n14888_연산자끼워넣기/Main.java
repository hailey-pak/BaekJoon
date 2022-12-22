package n14888_연산자끼워넣기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static long min = 1000000000;
    static long max = -1000000000;
    static int n;
    static int[] op;    // + - x ÷
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        op = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        dfs(1, num[0]);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int depth, long val) {
        if (depth == n) {
            max = Math.max(max, val);
            min = Math.min(min, val);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                switch (i) {
                    case 0:
                        dfs(depth + 1, val + num[depth]);
                        break;
                    case 1:
                        dfs(depth + 1, val - num[depth]);
                        break;
                    case 2:
                        dfs(depth + 1, val * num[depth]);
                        break;
                    case 3:
                        dfs(depth + 1, val / num[depth]);
                }
                op[i]++;
            }
        }
    }
}
