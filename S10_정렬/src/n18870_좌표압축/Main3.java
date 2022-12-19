package n18870_좌표압축;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 *  Arryas.copyOf()를 통해 배열 복사
 */
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        int[] sort = num.clone();
        Arrays.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sort[i])) {
                map.put(sort[i], idx++);
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(map.get(num[i]) +" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
