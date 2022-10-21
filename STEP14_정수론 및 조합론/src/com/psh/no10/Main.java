package com.psh.no10;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                String key = br.readLine().split(" ")[1];
                if (map.containsKey(key)){
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
            }

            int result = 1;
            for (int val : map.values()) {
                result *= (val + 1);
            }
            bw.write(result-1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
