package step9;

import java.util.*;

public class Boj_1978{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int result = 0;
		for(int i=0; i<N; i++){  
			int num = sc.nextInt();
			int cnt = 0;
			for(int j=1; j<=num; j++){ 
				if(num%j == 0){ 
					cnt++;
				}
			}
			if(cnt==2){ // 1과 자기 자신을 나눴을 때 이렇게 두가지 경우의 수만 만족할 때 result++;
				result++;
			}
		}
		sc.close();
		System.out.println(result);
	}
}