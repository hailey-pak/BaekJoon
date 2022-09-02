package com.psh.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> mods = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int k = Integer.parseInt(br.readLine())%42;
            if (!mods.contains(k)) mods.add(k);
        }
        System.out.print(mods.size());
    }
}
