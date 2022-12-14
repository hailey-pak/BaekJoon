package n10807_개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[201];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(str[i]) + 100]++;
        }

        int v = Integer.parseInt(br.readLine());
        System.out.print(arr[v+100]);
        br.close();
    }
}
