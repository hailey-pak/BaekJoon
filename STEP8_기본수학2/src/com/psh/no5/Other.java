package com.psh.no5;

import java.io.*;

/*
 *   에라토스테네스의 체
 *   k=2부터 N의 제곱근 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다.
 *   주어진 범위 안의 모든 수를 제곱근까지 반복 안해도 되니까 시간이 더 적게 걸림!
 * */
public class Other {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime = makePrime(123456*2+1);    //1 ≤ n ≤ 123,456이고 각 케이스별로 n보다 크고 2n보다 같거나 작은 소수의 개수를 출력하므로
        int n;
        while ((n = Integer.parseInt(br.readLine()) )!= 0) {
            int cnt = 0;
            for (int i = n+1; i <= 2*n; i++) {
                if(!prime[i]) cnt++;
            }
            bw.write(cnt+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }


    /*
    *   소수가 아닌 index = true
    *   소수인 index = false
    *   입력된 N의 범위까지 소수판별 배열 반환
    * */
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

