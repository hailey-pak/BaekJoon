package com.psh.no09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=","a");
        System.out.print(str.length());
    }
}
