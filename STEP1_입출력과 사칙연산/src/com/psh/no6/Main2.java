package com.psh.no6;

import java.io.IOException;

public class Main2 {
	public static void main(String[] args) throws IOException {
		byte[] b = {0,0,0};
		System.in.read(b);
		System.out.print((b[0]-48)/(double)(b[2]-48));
	}
}
