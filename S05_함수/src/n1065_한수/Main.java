package n1065_한수;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            if ( chkNumber(i) ) n++;
        }
        System.out.print(n);
    }

    public static boolean chkNumber(int n) {
        if (n<100) return true;
        if (n==1000) return false;

        int a = n/100%10;   //100의 자리수
        int b = n/10%10;   //10의 자리수
        int c = n%10;   //1의 자리수

        return a - b == b - c;
    }
}
