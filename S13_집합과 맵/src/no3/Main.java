package no3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 *  시간초과..............ㅠㅠ
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        Map<String, String> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            map.put(String.valueOf(i), br.readLine());
        }

        for (int i = 0; i < m; i++) {
           String s = br.readLine();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equals(s)) {
                    bw.write(entry.getValue()+"\n");
                    break;
                }
                if (entry.getValue().equals(s)) {
                    bw.write(entry.getKey()+"\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
