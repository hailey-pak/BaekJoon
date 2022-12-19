package n9461_파도반수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] arr = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(P(num)).append("\n");
        }
        System.out.println(sb);
    }

    static long P(int n) {
        if (arr[n] == 0) {
            arr[n] = P(n-2) + P(n-3);
        }
        return arr[n];
    }
}
