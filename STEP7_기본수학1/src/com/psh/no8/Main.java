package com.psh.no8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");

        BigInteger a = new BigInteger(in[0]);
        BigInteger b = new BigInteger(in[1]);

        a = a.add(b);
        System.out.print(a);
    }
}
