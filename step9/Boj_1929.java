package step9;

import java.util.*;

public class Boj_1929 {
    public static boolean[] prime;
    public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
        
		prime = new boolean[N + 1];
		fn_prime();
		
		for(int i=M; i<=N; i++){
			if(!prime[i]){
				System.out.println(i);
			}
		}
	}
	
	public static void fn_prime() {
		// true = 소수아님 , false = 소수
		prime[0] = prime[1] = true; // 0과 1은 소수가 아니다
		
		for(int i=2; i <=Math.sqrt(prime.length); i++){ // Math.sqrt()는 제곱근을 구하는 함수
			if(prime[i]) continue;
			for(int j=i*i; j < prime.length; j+=i){
				prime[j] = true;
			}
		}
	}
}
