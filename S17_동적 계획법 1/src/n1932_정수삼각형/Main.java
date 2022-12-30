package n1932_정수삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {

                //왼쪽 끝 -> 바로 위의 제일 왼쪽 숫자를 누적
                if (j == 0) {
                    triangle[i][j] += triangle[i-1][j];
                }
                //오른쪽 끝 -> 바로 위의 제일 오른쪽 숫자를 누적 (갯수가 한개씩 적으므로 -1)
                else if (j == i) {
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else {
                    //중간 -> 이전 숫자 중 더 큰 수를 누적
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }
                ans = Math.max(ans, triangle[i][j]);
            }
        }
        System.out.print(ans);
    }

}
