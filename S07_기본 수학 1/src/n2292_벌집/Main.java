package n2292_벌집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        int cnt = 1;        //거리
        int range = 2;      //범위

        if (N>1) {
            while (range <= N) {
                range += (6*cnt);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}

/*
1
2~7  (+6) - 6*1
8~19 (+12) - 6*2
20~37 (+18) - 6*3
38~61 (+24) - 6*4
* */