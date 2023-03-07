package n10810_공넣기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[] arr = new int[N];

        for (int n = 0; n < M; n++) {
            str = br.readLine().split(" ");
            int i = Integer.parseInt(str[0]) - 1;
            int j = Integer.parseInt(str[1]) - 1;
            int k = Integer.parseInt(str[2]);

            for (int l = i; l <= j; l++) {
                arr[l] = k;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int a : arr) {
            bw.write(a +" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

