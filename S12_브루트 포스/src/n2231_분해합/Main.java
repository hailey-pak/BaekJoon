package n2231_분해합;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        System.out.print(getCons(n));
    }

    private static int getCons(int n) {
        for (int i = 1; i < n; i++) {
            int sum = i;

            int k = i;
            while (k != 0) {
                sum += k % 10;
                k =  k / 10;
            }

            if (sum == n) {
                return i;
            }
        }
        return 0;
    }
}
