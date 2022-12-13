package no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 *   Stream / distinct()  --- Stream의 distinct()를 사용해서 배열의 중복을 제거할 수 있다.
 * */
public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mods = new int[10];
        for (int i = 0; i < 10; i++) {
            mods[i] = Integer.parseInt(br.readLine())%42;
        }

        System.out.print(Arrays.stream(mods).distinct().count());
    }
}
