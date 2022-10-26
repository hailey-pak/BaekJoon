package com.psh.no4;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        String[] card = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String s = card[i];
            if (map.containsKey(s)) {
                int cnt = map.get(s) + 1;
                map.put(s, cnt);
            } else {
                map.put(s, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        String[] find = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            String s = find[i];
            if (map.containsKey(s)) {
                bw.write(map.get(s)+" ");
            } else {
                bw.write(0 + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
