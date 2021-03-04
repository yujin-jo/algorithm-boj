package step9;

import java.io.*;

public class Boj_2581 {
    public static void main (String[] args) throws java.lang.Exception	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
 
		int sum = 0; // 출력할 소수 합계
		int min = 10000; // 최솟값
		
		boolean flag = false;
		
		if(M <= N){
			for(int i=M; i<=N; i++){ 
				for(int j=2; j<i; j++){
					if(i%j == 0){ 
                        flag = true;
                        break;
					}
				}
				if(!flag && i != 1){ // 소수일 경우
					sum += i;
					if(min > i){
						min = i;					
					}				
				}
				flag = false;
			}
		
			if(sum == 0){
                bw.write(String.valueOf(-1));
			} else {
                bw.write(String.valueOf(sum));
                bw.newLine();
                bw.write(String.valueOf(min));
			}
            bw.close();
		}
	}

}
