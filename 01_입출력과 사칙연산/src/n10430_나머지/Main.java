package n10430_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = br.readLine().split(" ");
		int A = Integer.parseInt(in[0]);
		int B = Integer.parseInt(in[1]);
		int C = Integer.parseInt(in[2]);
		br.close();
		
		System.out.println( (A+B)%C );
		System.out.println( ((A%C)+(B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C)*(B%C))%C);
	}
}
