package step8;

import java.util.Scanner;

public class Boj_1712 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt(); // 불변 비용 A
		int B = in.nextInt(); // 가변 비용 B
		int C = in.nextInt(); // 상품 가격
		in.close();
		
		if (C <= B) {
			System.out.println(-1); // 이익이 발생하지 않을 때 출력
		} 
		else {
			System.out.println((A/(C-B))+1); // 이익이 발생할 경우 출력
		}
	}
}
