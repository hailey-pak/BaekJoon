package n9020_골드바흐의추측;

import java.io.*;

/*
*       시간초과
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        //10,000 까지의 소수 구하기
        boolean[] prime = makePrime(10001);

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            int a = 0, b = 0;
            for (int j = 2 ; j <= n/2 ; j++) {
                if (!prime[j]) {
                    for (int k = j; k < n-1; k++) {
                        if (!prime[k]) {
                            if (j + k == n) {
                                a = j; b = k;
                            } else if (j + k > n) {
                                break;
                            }
                        }
                    }
                }
            }
            bw.write(a + " " + b + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean[] makePrime(int N) {
        boolean[] prime = new boolean[N+1]; //0 ~ N
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(N) ; i++) {
            //이미 체크된 배열이면 다음 반복문으로 skip
            if (prime[i]) continue;

            //i의 배수들을 걸러주기 위한 반복문
            for (int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }
        return prime;
    }
}
