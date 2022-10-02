package com.psh.no6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        HashSet<Integer> set = new HashSet<>();

        for (String s : br.readLine().split(" ")) {
            set.add(Integer.parseInt(s));
        }
        int cnt = 0;
        for (String s : br.readLine().split(" ")) {
            int n = Integer.parseInt(s);
            if (set.contains(n)) {
                cnt++;
            } else {
                set.add(n);
            }
        }
        System.out.println(set.size()-cnt);
        br.close();
    }
}
