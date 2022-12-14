package n5622_다이얼;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        int n, s = 0;
        while ( (n = System.in.read() - 59) > -1)
            s += (n - n / 24 - n / 31) / 3 + 1;
        System.out.print(s);
    }
}
