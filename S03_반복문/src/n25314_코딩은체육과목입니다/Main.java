package n25314_코딩은체육과목입니다;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = N / 4;
        String sb = "long ".repeat(Math.max(0, cnt)) +
                "int";
        System.out.println(sb);
    }
}

