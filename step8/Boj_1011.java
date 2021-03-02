package step8;

import java.util.*;

public class Boj_1011{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		long cnt = sc.nextInt();
		
		for(long i=0; i<cnt; i++){
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			long dis = b-a; // 이동해야할 거리
			long x = 0; // 작동횟수
			long result = 1; // 출력값
			
			while(x < dis){ // 작동횟수 < 거리
				result++;
				x += (result/2); 
			}
			System.out.println(result-1);
		}
        sc.close();
	}
}