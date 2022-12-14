package n2563_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            for (int a = x; a < x+10; a++) {
                for (int b = y; b < y+10; b++) {
                    if (!arr[a][b]) {
                        arr[a][b] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
        br.close();
    }
}
