package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj_2839 {
    public static void main (String[] args) throws java.lang.Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 킬로그램 입력
		
		// 봉투 개수가 같은 조건
		// 1. N이 4이거나 7일 경우
		if(N==4 || N==7){
			System.out.println(-1);
		// 2. N이 5의 배수일 경우 5의 합
		} else if((N%5) == 0){
			System.out.println(N/5);
		// 3. N이 5의 배수+첫번째 수와 5의 배수+세번째 수인 경우
		} else if((N%5)==1 || (N%5)==3){ 
			System.out.println(N/5 + 1);
		// 4. N이 5의 배수+두번째 수와 5의 배수+네번째 수인 경우
		} else if((N%5)==2 || (N%5)==4){
			System.out.println(N/5 + 2);
		}
	}
}