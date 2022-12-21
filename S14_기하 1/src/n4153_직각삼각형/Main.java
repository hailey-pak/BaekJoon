package n4153_직각삼각형;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 직각삼각형
 * a^2 = b^2 + c^2
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String end = "0 0 0";
        String in;
        while ( !(in=br.readLine()).equals(end) ) {
            int[] n = Arrays.stream(in.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (rightAngle(n)) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.print(sb);
        br.close();
    }

    static boolean rightAngle(int[] n) {
        int a = n[0], b = n[1], c = n[2];
        if( Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) return true;
        if( Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) return true;
        return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
    }
}
