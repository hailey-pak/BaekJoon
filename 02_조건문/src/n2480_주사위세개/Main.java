package n2480_주사위세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int c = Integer.parseInt(in[2]);

        //삼항연산자 사용해서 조건문 줄이기
        int sum = (a==b?a==c?10000+a*1000:1000+a*100:a==c?1000+a*100:b==c?1000+b*100:
                a>b?a>c?100*a:100*c:b>c?100*b:100*c);

        System.out.print(sum);
        br.close();
    }
}
