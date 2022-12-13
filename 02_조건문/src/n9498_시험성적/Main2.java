package n9498_시험성적;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(a<60?"F":a<70?"D":a<80?"C":a<90?"B":"A");
    }
}
