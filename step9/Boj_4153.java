package step9;

import java.util.*;

public class Boj_4153 {
    public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int[] arr = {a,b,c};
			Arrays.sort(arr);
			
			// break : 마지막줄에는 0 0 0이 입력
			if(a == 0){
				break;
			}
			
			if(Math.sqrt(Math.pow(arr[0],2) + Math.pow(arr[1],2)) == arr[2]){
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
		sc.close();
	}
}
