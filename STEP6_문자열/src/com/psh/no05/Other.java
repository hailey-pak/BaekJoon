package com.psh.no05;

/*
*   이 코드가 훨 씬 빠르고 메모리도 적게 씀!!!
* */
public class Other {
    public static void main(String[] args) throws Exception {
        int[] a = new int[26];
        int c, max = 0, ch = -2;

        while ( (c = System.in.read()) > 64) {
            a[c -= c < 96 ? 65 : 97]++;

            if (max < a[c]) {
                max = a[c];
                ch = c;
            } else if (max == a[c]) {
                ch = -2;
            }
        }
        System.out.print((char)(ch + 65));
    }
}
