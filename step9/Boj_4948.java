package step9;

import java.util.*;

public class Boj_4948{
	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		sc.close();
        
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int cnt = 0;
			boolean flag = false;
			
			for(int i=n+1; i<=2*n; i++){
				int root = (int)Math.sqrt(i) + 1;
				
				for(int j=2; j<root; j++){
					if(i%j == 0){
						flag = true;
						break;
					}
				}
				if(!flag){
					cnt++;
				}
				flag = false;
			}
			System.out.println(cnt);
		}
	}
	
}