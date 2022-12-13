package n10950_A_plus_B_minus_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] sum = new int[t];
        for (int i = 0; i < t; i++) {
            String[] in = br.readLine().split(" ");
            sum[i] = Integer.parseInt(in[0]) + Integer.parseInt(in[1]);
        }
        for (int s : sum) {
            System.out.println(s);
        }
        br.close();
    }
}
