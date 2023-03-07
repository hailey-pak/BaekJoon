package n2444_별찍기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int all = 2 * n - 1;
        int mid = all / 2;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mid + 1; i++) {
            int k = i * 2 + 1;
            sb.append(" ".repeat(Math.max(0, (all - k) / 2)));
            sb.append("*".repeat(k));
            sb.append("\n");
        }

        for (int i = mid - 1; i >= 0; i--) {
            int k = i * 2 + 1;
            sb.append(" ".repeat(Math.max(0, (all - k) / 2)));
            sb.append("*".repeat(Math.max(0, k)));
            if (i != 0) sb.append("\n");
        }
        System.out.print(sb);
    }
}
