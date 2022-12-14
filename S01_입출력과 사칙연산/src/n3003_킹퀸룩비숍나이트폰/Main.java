package n3003_킹퀸룩비숍나이트폰;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		int[] origin = {1, 1, 2, 2, 2, 8};
		Scanner sc = new Scanner(System.in);

		for (int j : origin) {
			System.out.print(j - sc.nextInt() + " ");
		}
		sc.close();
	}
}
