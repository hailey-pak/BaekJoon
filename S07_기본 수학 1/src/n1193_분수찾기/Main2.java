package n1193_분수찾기;

public class Main2 {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();

        int a = 1;
        while (x > a) {
            x -= a++;
        }

        System.out.print( (a % 2 > 0 ? a - x + 1 : x) + "/" + (a % 2 > 0 ? x : a - x + 1));
    }
}
