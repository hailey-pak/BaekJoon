package com.sh.no1;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        int x = read(), y = read(), w = read(), h = read();
        System.out.print(Math.min(Math.min(x, y), Math.min(w-x, h-y)));
    }
    static int read() throws IOException {
        int a, b = 0;
        while ((a = System.in.read()) > 32)
            b = b * 10 + a - 48;
        return b;
    }
}
