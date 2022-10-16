package com.psh.no02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.print(max * min);
        br.close();
    }
}
