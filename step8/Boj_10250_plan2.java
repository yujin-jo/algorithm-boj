package step8;

import java.util.*;
import java.io.*;

public class Boj_10250_plan2{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int t = Integer.parseInt(st.nextToken()); 
		
		for(int i=0; i<t; i++){
			st = new StringTokenizer(br.readLine()); 
			int H = Integer.parseInt(st.nextToken()); // 층수
			int W = Integer.parseInt(st.nextToken()); // 호수
			int N = Integer.parseInt(st.nextToken()); // 손님 순서
			
			// 나머지가 0일 경우
			// H : H층이 배정받는 층 = H*100
			// W : 순서에서 층 나눈 값 = 호수
			if(N % H == 0){ 
				System.out.println(H*100 + N/H); 
			// H : N번째에서 H층을 나눈 나머지 값 * 100
			// W : N번째에서 H층 나눈 몫. 호수는 1호부터 시작하기 때문에 1을 더해준다.
			} else {
				System.out.println(N%H * 100 + (N/H + 1));
			}
		}
	}
}