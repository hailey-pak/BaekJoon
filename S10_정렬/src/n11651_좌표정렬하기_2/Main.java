package n11651_좌표정렬하기_2;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] coord = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            coord[i][0] = Integer.parseInt(s[0]);
            coord[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(coord, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < n; i++) {
            bw.write(coord[i][0] + " " + coord[i][1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
