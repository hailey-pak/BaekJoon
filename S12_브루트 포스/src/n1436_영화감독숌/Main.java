package n1436_영화감독숌;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int cnt = 1;
        int num = 666;
        while (cnt < n) {
            num ++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.print(num);
    }
}
