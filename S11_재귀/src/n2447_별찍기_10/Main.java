package n2447_별찍기_10;

import java.util.Scanner;

public class Main {
    private static char[][] arr;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        arr = new char[n][n];

        star(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void star(int x, int y, int n, boolean b) {

        if (b) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int k = n/3;
        int cnt = 0;

        for(int i = x; i < x + n; i += k) {
            for(int j = y; j < y + n; j += k) {
                cnt++;
                star(i, j, k, cnt == 5);
            }
        }
    }
}
