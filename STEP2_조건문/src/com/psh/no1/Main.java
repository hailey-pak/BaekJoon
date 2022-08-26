package com.psh.no1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = br.readLine().split(" ");
		int A = Integer.parseInt(in[0]);
		int B = Integer.parseInt(in[1]);
		
		if (A>B) System.out.print(">");
		if (A<B) System.out.print("<");
		if (A==B) System.out.print("==");
		
		br.close();
	}
}
