package n2477_참외밭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        int[] dir = new int[6];
        int[] len = new int[6];
        for (int i = 0; i < 6; i++) {
            String[] s = br.readLine().split(" ");
            dir[i] = Integer.parseInt(s[0]);
            len[i] = Integer.parseInt(s[1]);
        }

        int maxWidth = 0, maxHeight = 0;
        int widthIdx = 0, heightIdx = 0;
        //1동 2서 3남 4북
        for (int i = 0; i < 6; i++) {
            if (dir[i] == 1 || dir[i] == 2) {
               if (len[i] > maxWidth) {
                   maxWidth = len[i];
                   widthIdx = i;
               }
            }
            if (dir[i] == 3 || dir[i] == 4) {
                if (len[i] > maxHeight) {
                    maxHeight = len[i];
                    heightIdx = i;
                }
            }
        }

        int blankWidth =  Math.abs(len[heightIdx+1 == 6 ? 0 : heightIdx+1] - len[heightIdx-1 == -1 ? 5 : heightIdx-1]);
        int blankHeight =  Math.abs(len[widthIdx+1 == 6 ? 0 : widthIdx+1] - len[widthIdx-1 == -1 ? 5 : widthIdx-1]);
        int area = maxWidth * maxHeight - (blankWidth * blankHeight);
        System.out.print(area * k);
        br.close();
    }
}
