package no7;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = new Scanner(System.in).next();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
