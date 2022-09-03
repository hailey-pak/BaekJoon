package com.psh.no6;

import java.io.*;
import java.util.Arrays;

/*
*      배열 형변환 --> Arrays.stream().mapToInt(Integer::parseInt)
* */
public class Other {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            String[] str = br.readLine().split(" ");
            int[] in = Arrays.stream(str)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int sum = 0;
            for (int j = 1; j < in.length ; j++) {
                sum+= in[j];
            }
            double avg = (double)sum/in[0];

            int cnt = 0;
            for (int j = 1; j <= in[0]; j++) {
                if (in[j] > avg) cnt++;
            }
            bw.write(String.format("%.3f", (double)cnt/in[0]*100)+"%\n");
        }
        bw.flush();
        bw.close();
    }

}

