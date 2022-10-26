package com.psh.no4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");

        double[] points = new double[n];
        double M = 0;
        for (int i = 0; i < n; i++) {
            points[i] = Double.parseDouble(in[i]);

            if (i==0) {
                M = points[i];
            } else {
                if (points[i] > M) M = points[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= points[i]/M*100;
        }
        System.out.print(sum/n);
    }
}
