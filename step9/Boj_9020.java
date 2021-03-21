package step9;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_9020 {

	public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		
		// 에라스토테네스의 체
		boolean[] arr = new boolean[10001];
		Arrays.fill(arr, true);
		// 소수 = true, 소수x = false
		arr[0] = arr[1] = false; // 1과 2는 소수가 아니다
		
		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			if (!arr[i]) continue;
			for (int j = i * i; j < arr.length; j += i) {
				arr[j] = false; // 소수 아님
			}
		}

		int T = sc.nextInt();
		sc.close();
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			int left = n/2;
			int right = n/2;
			
			while(true){
				if(arr[left] && arr[right]){ // 소수일 때
					System.out.println(left + " " + right);
					break;
				}
				left--;
				right++;
			}
		}
	}
}