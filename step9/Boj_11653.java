package step9;

import java.io.*;

public class Boj_11653 {
    public static void Main() throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
    
        int num = 2;
        while(N >= 1){
            if(N%num == 0){  
                System.out.println(num); 
                N = N/num; 
            } else { 
                num++; 
            }
        }		
    }
}
