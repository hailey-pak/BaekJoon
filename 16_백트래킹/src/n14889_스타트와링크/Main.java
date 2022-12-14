package n14889_스타트와링크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] score;
    static boolean[] visited;
    static int N;
    static int min = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        score = new int[N][N];
        for (int i = 0; i < N; i++) {
            score[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        visited = new boolean[N];

        dfs(0, 0);
        System.out.println(min);
    }

    static void dfs(int idx, int depth) {
        if (depth == N/2) {
            calScore();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static void calScore() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += score[i][j];
                    start += score[j][i];
                }
                if (!visited[i] && !visited[j]) {
                    link += score[i][j];
                    link += score[j][i];
                }
            }
        }

        int dif = Math.abs(start - link);
        if (dif == 0) {
            System.out.println(0);
            System.exit(0);
        }
        min = Math.min(min, dif);
    }
}
