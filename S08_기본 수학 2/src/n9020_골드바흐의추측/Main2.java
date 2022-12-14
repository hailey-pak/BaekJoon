package n9020_골드바흐의추측;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        boolean[] prime = Main.makePrime(10001);

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            //두 수의 차가 최소인 소수를 구하기 위해 n/2 값에서 비교 시작
            int a = n / 2, b = n / 2;

            while (a >= 2) {
                if (!prime[a]) {
                    //a가 소수이면 b의 값이 소수인 값을 찾아서 a+b 값이 n보다 크거나 같은지 비교 (더한 값이 크다면 b값을 고정하고 a값을 줄이기 위해)
                    while (b < n - 1) {
                        if (!prime[b] && a + b >= n) {
                            break;
                        }
                        b += 1;
                    }
                    //a+b의 값이 n과 같으면 반복문 종료 아니라면, if문 종료 후 a값 줄어듦
                    if (a + b == n) {
                        break;
                    }
                }
                a -= 1;
            }
            bw.write(a + " " + b + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
