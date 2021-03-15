package step9;

import java.util.*;

public class Boj_1085 {
    public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.print(Math.min(Math.min(w-x, x),Math.min(h-y, y)));
	}
}
