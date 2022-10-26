package com.psh.no10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (check(word)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    private static boolean check(String word) {
        boolean[] chk = new boolean[26];
        int prev = 0;

        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);       //현재 문자

            if (prev != now) {  //이전문자 != 현재문자

                if (!chk[now - 'a']) {      //처음 들어온 문자면 true로 변경후 현재 문자 저장
                    chk[now - 'a'] = true;
                    prev = now;
                } else {                    //처음 들어온 문자가 아니면 그룹문자가 아님
                    return false;
                }
            }
        }
        return true;
    }
}
