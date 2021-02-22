package step8;

import java.util.*;

public class Boj_2869_plan1{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 낮에 올라갈 수 있는 길이
		int B = sc.nextInt(); // 자는 동안 미끄러지는 길이
		int V = sc.nextInt(); // 나무막대 높이
		sc.close();

		int sum = 0; // 합계
		int day = 1;
		
		while(true){
			sum = sum+A; 
			// 낮에 올라간 수와 나무막대 높이가 같거나 클 때 break
			if(sum >= V){
				break;
			} 
			sum = sum-B; 
			day++; // 밤이 지나고나서 day++;
		}
		System.out.print(day);
	}
}