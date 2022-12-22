package no06;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);

        for (int i = 1; i < n; i++) {
            int b = Integer.parseInt(str[i]);
            int gcd = getGcd(a, b);
            bw.write(a/gcd + "/" + b/gcd);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int getGcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int n;
        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}
