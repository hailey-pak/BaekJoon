package n10951_A_plus_B_4;

import java.io.*;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String in;

        while ((in = br.readLine()) != null) {
            st = new StringTokenizer(in, " ");
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}
