package n10818_최소최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] in = br.readLine().split(" ");
        int min= Integer.parseInt(in[0]), max=Integer.parseInt(in[0]);
        for (int i = 1; i < n; i++) {
           int k = Integer.parseInt(in[i]);
           if (k>max) max=k;
           if (k<min) min=k;
        }
        System.out.print(min +" " +max);

    }
}
