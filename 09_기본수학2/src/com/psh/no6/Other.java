package com.psh.no6;

import java.io.*;

public class Other {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        boolean[] prime = Main.makePrime(10001);

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            //두 수의 차가 최소인 소수를 구하기 위해 n/2 값에서 비교 시작
            int a = n / 2, b = n / 2;

            while (true) {
                //나누기 2를 한 값에서 똑같이 -1 +1 씩 하면 합은 유지되니까!!! 둘다 소수인 값만 찾으면 됨
                if (!prime[a] && !prime[b]) {
                    bw.write(a + " " + b + "\n");
                    break;
                }
                a--;
                b++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
