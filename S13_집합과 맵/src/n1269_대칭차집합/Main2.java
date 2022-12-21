package n1269_대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for (String s : br.readLine().split(" ")) {
            a.add(Integer.parseInt(s));
        }
        for (String s : br.readLine().split(" ")) {
            b.add(Integer.parseInt(s));
        }

        HashSet<Integer> all = new HashSet<>();
        all.addAll(a);
        all.addAll(b);

        a.retainAll(b);     //공통원소
        all.removeAll(a);   //전체에서 공통원소 제거

        System.out.println(all.size());
        br.close();
    }
}
