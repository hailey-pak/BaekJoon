package n10250_ACM호텔;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] in = br.readLine().split(" ");
            int H = Integer.parseInt(in[0]);    //호텔의 층 수
            int N = Integer.parseInt(in[2]);    //몇번째 손님인지

            int Y = N%H;
            int X = N/H +1;
            if (Y == 0) {
                Y = H;
                X -= 1;
            }
            bw.write(String.format("%d%02d", Y, X)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
