package n5086_배수와약수;

import java.io.*;

public class Main {

    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str;
        while (true) {
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            if (a==0 && b==0) break;
            isFactorOrMultiple(a, b);
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static void isFactorOrMultiple(int a, int b) throws IOException {
        if (a % b == 0) {
            bw.write("multiple" + "\n");
            return;
        } if (b % a == 0) {
            bw.write("factor" + "\n");
            return;
        }
        bw.write("neither" + "\n");
    }
}
