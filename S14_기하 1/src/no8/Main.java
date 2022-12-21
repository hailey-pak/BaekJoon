package no8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int R = H / 2;
        int cnt = 0;
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            //사각형 안에 속하는 지
            if (px >= X && px <= X + W && py >= Y && py <= Y + H) {
                cnt++;
                continue;
            }
            //왼쪽 반원 안에 속하는 지
            int cx = X;
            double cy = Y + R;
            double dist = Math.sqrt(Math.pow(cx - px, 2) + Math.pow(cy - py, 2));
            if (dist <= R) {
                cnt++;
                continue;
            }
            //오른쪽 반원에 속하는 지
            cx = X + W;
            dist = Math.sqrt(Math.pow(cx - px, 2) + Math.pow(cy - py, 2));
            if (dist <= R) {
                cnt++;
            }
        }
        System.out.print(cnt);
        br.close();
    }

}
