package no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] mods = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int k = Integer.parseInt(br.readLine())%42;
            mods[k] = true;
        }
        int n=0;
        for (boolean m : mods) {
            if (m) n++;
        }
        System.out.print(n);
    }
}
