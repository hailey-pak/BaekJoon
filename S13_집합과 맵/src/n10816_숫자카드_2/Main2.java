package n10816_숫자카드_2;

import java.io.*;
import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();

        br.readLine();

        for (String s : br.readLine().split(" ")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        br.readLine();

        for (String s : br.readLine().split(" ")) {
            bw.write(map.getOrDefault(s, 0) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
