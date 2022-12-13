package n1110_더하기사이클;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n, cnt=0;

        do {
            int sum = x / 10 + x % 10;
            x = x % 10 * 10 + sum % 10;
            cnt++;
        } while (x != n);
        System.out.print(cnt);
    }
}
