package com.psh.no10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		int[] origin = {1, 1, 2, 2, 2, 8};
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] - sc.nextInt() + " ");
		}
		sc.close();
	}
}
