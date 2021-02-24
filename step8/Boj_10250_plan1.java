package step8;

import java.util.*;

public class Boj_10250_plan1{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
			int H = sc.nextInt(); // 층수
			int W = sc.nextInt(); // 호수
			int N = sc.nextInt(); // 손님 순서
			
			int resHeight = 0;
			int resWidth = 1;
			for(int j=0; j<N; j++){ // 입력한 N 만큼 반복
				if(resHeight <= H){ 
                 			// 전체 층수와 출력할 층수가 같고 
					if(resHeight == H && resWidth < W){ 
						resWidth++;	 // 호수 증가
						resHeight = 1;	// 층은 1로 초기화
					} else {
						resHeight++; 
					}
				} 
			}
			System.out.println(resHeight * 100 + resWidth);
		}
		sc.close();
	}
}
