package n10807_개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int a : arr) {
            if (a==v) cnt++;
        }
        System.out.print(cnt);
        br.close();
    }
}
