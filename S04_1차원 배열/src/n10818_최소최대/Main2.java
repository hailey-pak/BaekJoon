package n10818_최소최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
*   Arrays.stream() 의 max() min()사용
* */
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String[] str = br.readLine().split(" ");
        int[] in = Arrays.stream(str)
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(in).max().getAsInt();
        int min = Arrays.stream(in).min().getAsInt();

        System.out.print(min +" " +max);
    }
}
