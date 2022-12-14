package n1193_분수찾기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();

        int n = 0, sum = 0;
        while (sum < x) {               //x가 몇번째 줄에 속하는지 구하기
            sum += ++n;
        }

        int k = x - (sum - n);          //해당 줄에서 몇번째로 나오는 지 구하기
        if (n % 2 == 0) {               //짝수번째 줄이면 분모는 오름차순(k), 분자는 내림차순(n-k+1)
            System.out.print(k + "/" + (n - k + 1));
        } else {
            System.out.print((n - k + 1) + "/" + k);
        }
    }
}

/*
1+2+3+4+5+6
1	1/1

2	1/2
3	2/1

4	3/1
5	2/2
6	1/3

7	1/4
8	2/3
9	3/2
10	4/1

11	5/1
12	4/2
13	3/3
14	2/4
15	1/5

* */