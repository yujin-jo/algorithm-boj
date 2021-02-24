package step8;

import java.io.*;

public class Boj_2775{
	public static void main (String[] args) throws java.lang.Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int test = Integer.parseInt(br.readLine());
        
		// 2차원 배열 만들기
		int[][] apt = new int[15][15]; // 제한 조건에 있는 0~14
		
		for(int i=0; i<15; i++){
			apt[i][1] = 1; // i층 1호
			apt[0][i] = i; // 0층 i호
		}
		
		for(int i=1; i<15; i++){ // 1층~14층
			for(int j=2; j<15; j++){ // 2호~14호
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		for(int i=0; i<test; i++){
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(apt[k][n]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}