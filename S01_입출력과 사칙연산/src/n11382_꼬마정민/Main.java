package n11382_꼬마정민;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        long sum = 0;
        for (String s : arr) {
            sum += Long.parseLong(s);
        }

        System.out.println(sum);
    }
}
