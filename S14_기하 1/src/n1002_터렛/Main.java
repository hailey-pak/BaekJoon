package n1002_터렛;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int r1 = Integer.parseInt(str[2]);
            int x2 = Integer.parseInt(str[3]);
            int y2 = Integer.parseInt(str[4]);
            int r2 = Integer.parseInt(str[5]);

            bw.write(findCount(x1, y1, r1, x2, y2, r2) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int findCount(int x1, int y1, int r1, int x2, int y2, int r2) {
        double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));

        if (d == 0) {
            if (r1 == r2) return -1;
        } else {
            if (d > Math.abs(r1-r2) && d < r1+r2 ) return 2;
            if (d == r1 + r2 || d == Math.abs(r1-r2)) return 1;
        }
        return 0;
    }
}
