package com.psh.no12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.print(a*(b%10) + "\n" + a*(b/10%10) + "\n" + a*(b/100) + "\n" + a*b );
	}
}
