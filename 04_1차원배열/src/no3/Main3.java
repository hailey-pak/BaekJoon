package no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 *   HashSet 활용 - HashSet은 중복된 값을 저장하지 않음.
 * */
public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.print(set.size());
    }
}

