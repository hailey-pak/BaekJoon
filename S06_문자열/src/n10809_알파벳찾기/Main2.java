package n10809_알파벳찾기;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        int i = 97;
        while (i<123) {
            System.out.print(S.indexOf(i++)+" ");
        }
    }
}
