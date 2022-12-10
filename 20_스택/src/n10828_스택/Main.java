package n10828_스택;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            String in = br.readLine();

            if (in.startsWith("push")) {
                int x = Integer.parseInt(in.replace("push", "").trim());
                stack.push(x);
            }
            if (in.startsWith("pop")) {
                bw.write((stack.empty()? -1 : stack.pop()) +"\n");
            }
            if (in.startsWith("size")) {
                bw.write(stack.size() +"\n");
            }
            if (in.startsWith("empty")) {
                bw.write((stack.empty()? 1 : 0) +"\n");
            }
            if (in.startsWith("top")) {
                bw.write((stack.empty()? -1 : stack.peek()) +"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
