package no03;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        int min = Math.min(a, b);
        int gcd = 1;
        for (int i = min; i > 0 ; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        bw.write(gcd +"\n");
        bw.write(a*b/gcd +"");
        bw.flush();
        bw.close();
        br.close();
    }
}
