package n1018_체스판다시칠하기;

import java.io.*;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        arr = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < m; j++) {
               if (s.charAt(j) == 'W') {
                   arr[i][j] = true;
               }
            }
        }

        int row = n - 7;
        int col = m - 7;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }
        System.out.print(min);
        br.close();
    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;

        boolean tf = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != tf) cnt++;
                tf = !tf;
            }
            tf = !tf;
        }

        /*
         *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
         *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
         *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
         */
        cnt = Math.min(cnt, 64 - cnt);

        min = Math.min(min, cnt);
    }
}
