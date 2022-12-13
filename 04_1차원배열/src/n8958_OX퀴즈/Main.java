package n8958_OX퀴즈;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] c = br.readLine().toCharArray();
            int sum=0, tmp=0;

            for (char value : c) {
                if (value == 'O') {
                    tmp++;
                    sum += tmp;
                } else {
                    tmp = 0;
                }
            }
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}
