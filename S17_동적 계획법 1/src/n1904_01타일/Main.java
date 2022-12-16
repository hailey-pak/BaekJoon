package n1904_01타일;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(countTile(n));
    }

    static int countTile(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int i1 = 1;
        int i2 = 2;
        int sum = i1 + i2;
        for (int i = 3; i <= n; i++) {
            sum = (i1 + i2) % 15746;
            i1 = i2;
            i2 = sum;
        }
        return sum ;
    }
}
