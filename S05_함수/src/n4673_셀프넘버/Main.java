package n4673_셀프넘버;

public class Main {
    public static void main(String[] args) {
        boolean[] chk = new boolean[10001];
        for (int i = 1; i < 100001; i++) {
            int n = d(i);
            if (n < 10001) chk[n] = true;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!chk[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int i) {
        int res = i;
        if (i >= 10000) { res += i / 10000; i %= 10000; }
        if (i >= 1000) { res += i / 1000; i %= 1000; }
        if (i >= 100) { res += i / 100; i %= 100; }
        if (i >= 10) { res += i / 10; i %= 10; }
        return res + i;
    }
}