package n2525_오븐시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int h = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int time = Integer.parseInt(br.readLine());

        int sum = h*60+m+time;

        h = sum/60;
        m = sum%60;

        if (h>=24) h-=24;

        System.out.print(h + " " + m);
        br.close();
    }
}
