package n2884_알람시계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int h = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        m -=45;
        if (m<0) {
            m +=60;
            if (h==0) {
                h=23;
            }else{
                h -=1;
            }
        }
        System.out.print(h + " " + m);
        br.close();
    }
}
