package step10;

import java.io.*;

public class Boj_10872{
	public static void main (String[] args) throws java.lang.Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int result = 1;
		for(int i=N; i>0; i--){ 
			result *= i;  
		}
		bw.write(String.valueOf(result));
		bw.close();
	}
}