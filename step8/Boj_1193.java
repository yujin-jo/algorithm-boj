package step8;

import java.util.Scanner;

public class Boj_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
        
		int line=1; // 해당 라인에 존재 하는 값
		int cnt=0; // 현재 갯수
        
        	// n번째 분수가 몇번째 라인에 있는지 구하기
		while(true){
            		if(cnt+line>=n){ 
            			break;
           		}
			cnt += line;
			line++;
		}
        
        	// 해당 라인에서 몇 번째인지 구하기 n-cnt
		int th = n - cnt;
		
        	// 홀수 짝수 조건 구분
		if(line % 2 == 0) { 
			System.out.println(th+"/"+(line-th+1));
		} else { 
			System.out.println((line-th+1)+"/"+th);
		}
	}
}
