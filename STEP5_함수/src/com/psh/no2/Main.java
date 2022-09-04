package com.psh.no2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] chk = new boolean[10001];

        for (int i = 1; i < 100001; i++) {
            int n = d(i);
            if (n < 10001) chk[n] = true;       //해당 자리수를 true값으로 저장
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < 10001; i++) {
            if (!chk[i+1]) bw.write(i+1+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n%10;        //끝자리수 더하기
            n = n/10;           //몫만 남김
        }
        return sum + n;
    }
}


