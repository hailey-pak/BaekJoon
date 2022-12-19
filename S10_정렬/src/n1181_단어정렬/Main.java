package n1181_단어정렬;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for (int i = 0; i < n; i++) str[i] = br.readLine();

        Arrays.sort(str, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < n; i++) {
            if (i != 0 && str[i-1].equals(str[i])) continue;
            bw.write(str[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
