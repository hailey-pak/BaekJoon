package n2563_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  예제 입력하면 맞는데 검사하면 틀리다고 나옴..
 *  이론 상 맞는 것 같은데 이유 모르겠음 나중에 다시 확인 해보기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int inter = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);

            for (int j = i - 1; j >= 0; j--) {
                int x = arr[i][0];
                int y = arr[i][1];
                int x2 = arr[j][0];
                int y2 = arr[j][1];
                if (Math.abs(x - x2) < 10 && Math.abs(y - y2) < 10) {
                    int w = 10 - Math.abs(x - x2);
                    int h = 10 - Math.abs(y - y2);
                    inter += w * h;
                }
            }
        }
        System.out.print(n * 100 - inter);
        br.close();
    }
}
