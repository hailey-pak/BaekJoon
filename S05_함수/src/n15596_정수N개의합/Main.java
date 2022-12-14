package n15596_정수N개의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] a = new int[str.length];
        for (int j = 0; j < a.length; j++) {
            a[j] = Integer.parseInt(str[j]);
        }

        Test test = new Test();
        System.out.println(test.sum(a));
    }
}
