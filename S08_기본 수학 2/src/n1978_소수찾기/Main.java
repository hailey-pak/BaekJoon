package n1978_소수찾기;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (isPrime(k)) sum++;
        }

        System.out.print(sum);
    }

    private static boolean isPrime(int k) {
        if (k==1) return false;

        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
