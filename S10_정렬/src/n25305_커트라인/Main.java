package n25305_커트라인;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);   //응시자 수
        int k = Integer.parseInt(str[1]);   //상을 받는 사람의 수

        String[] str2 = br.readLine().split(" ");
        Integer[] x = new Integer[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.valueOf(str2[i]);
        }

        Arrays.sort(x, Collections.reverseOrder());
        System.out.print(x[k-1]);
        br.close();
    }
}
