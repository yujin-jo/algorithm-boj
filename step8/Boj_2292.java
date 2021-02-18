package step8;

import java.util.Scanner;
 
public class Boj_2292{
   public static void main (String[] args) throws java.lang.Exception   {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //58
        sc.close();

        int room = 1; // 벌집의 방 수
        int range = 2; // 범위
    
        while (true) {
            if(n < range){ // n이 방 수보다 작거나 같을 경우 break
                break;
            } else {
                range += 6*room; // 다음 범위의 최소값으로 범위 변경
                room++; // 방 수 증가
            }
        }
        System.out.print(room);
    }
}