package n2869_달팽이는올라가고싶다;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int A = Integer.parseInt(in[0]);    //낮에 올라가는 거리
        int B = Integer.parseInt(in[1]);    //밤에 떨어지는 거리
        int V = Integer.parseInt(in[2]);    //나무높이

        int n = (V-B) / (A-B);
        if ( (V-B) % (A-B) !=0 ) n++;
        System.out.print(n);
    }
}

/*
입력값: 2 1 5
아침  밤  합계  날짜
+2   -1   1    1
+2   -1   2    2
+2   -1   3    3
+2        4    4   //밤까지 안가도 정상에 올라서 끝남

1 + (2-1)*n >= 5 일때 끝
B + (A-B)*n >= V
n >= (V-B)/(A-B)

 */