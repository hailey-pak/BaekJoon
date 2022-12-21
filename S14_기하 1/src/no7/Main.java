package no7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int x2 = Integer.parseInt(str[2]);
            int y2 = Integer.parseInt(str[3]);

            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                str = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                int r = Integer.parseInt(str[2]);

                boolean b1 = Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2) > Math.pow(r, 2);
                boolean b2 = Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2) > Math.pow(r, 2);

                if ( (b1 && !b2) || (!b1 && b2)) cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
