package no12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        long n = Long.parseLong(str[0]);
        long m = Long.parseLong(str[1]);

        long two = getCnt(n, 2) - getCnt(n-m, 2) - getCnt(m, 2);
        long five = getCnt(n, 5) - getCnt(n-m, 5) - getCnt(m, 5);

        System.out.print(Math.min(two, five));
        br.close();
    }

    static long getCnt(long num, long k) {
        long cnt = 0;
        for (long i = k; i <= num; i *= k) {
            cnt += num / i;
        }
        return cnt;
    }
}
