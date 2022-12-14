package n2292_벌집;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = 1;
        while(a > 1) {
            a -= 6*b++;
        }
        System.out.print(b);
    }
}
