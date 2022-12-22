package no08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);


        int[][] arr = new int[n+1][n+1];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <= i; j++) {
                if(i == j || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % 10007;
            }
        }
        System.out.println(arr[n][k]);
    }
}
