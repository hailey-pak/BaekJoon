package com.psh.no02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(char c : br.readLine().toCharArray()) {
           // sum += c-'0';
           sum += Character.getNumericValue(c);
        }
        System.out.print(sum);
    }
}
