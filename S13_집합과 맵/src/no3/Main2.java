package no3;

import java.io.*;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        HashMap<String, String> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            String s = br.readLine();
            map.put(String.valueOf(i), s);
            map.put(s, String.valueOf(i));
        }

        for (int i = 0; i < m; i++) {
           String s = br.readLine();
           bw.write(map.get(s) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
