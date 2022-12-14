package n2566_최댓값;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        int maxI = 0, maxJ = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > arr[maxI][maxJ]) {
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        bw.write(arr[maxI][maxJ] + "\n");
        bw.write(maxI + 1 + " " + (maxJ + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
