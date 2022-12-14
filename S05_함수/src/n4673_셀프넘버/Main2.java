package n4673_셀프넘버;

public class Main2 {
    public static void main(String[] args) {
        boolean[] chk = new boolean[10001];

        for (int i = 1; i < 100001; i++) {
            int n = d(i);
            if (n < 10001) chk[n] = true;       //해당 자리수를 true값으로 저장
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!chk[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int n) {
        int sum = n;
        while (n != 0) {
            sum += n%10;        //끝자리수 더하기
            n = n/10;           //몫만 남김
        }
        return sum + n;
    }
}


