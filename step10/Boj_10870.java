package step8;

import java.util.*;

public class Boj_10870 {
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n){
		if(n == 0){
			return 0;	
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
