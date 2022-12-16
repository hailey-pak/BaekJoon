package n9184_신나는함수실행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][][] arr = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] str = br.readLine().split(" ");
            if (str[0].equals("-1") && str[1].equals("-1") && str[2].equals("-1")) break;

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int ans = w(a, b, c);

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(ans);
            sb.append("\n");
        }

        sb.delete(sb.length()-1, sb.length());
        System.out.print(sb);
    }

    static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        if(arr[a][b][c] != 0) {
            return arr[a][b][c];
        }

        if (a < b && b < c) {
            arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return arr[a][b][c];
        }
        arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        return arr[a][b][c];
    }
}
