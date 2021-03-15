package step9;

import java.util.*;

public class Boj_3009 {
    public static void main (String[] args) throws java.lang.Exception	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = {sc.nextInt(),sc.nextInt()}; 
		int[] arr2 = {sc.nextInt(),sc.nextInt()};
		int[] arr3 = {sc.nextInt(),sc.nextInt()}; 
		int[] arr4 = {0,0};
        sc.close();
        
		for(int i=0; i<arr1.length; i++){
			if(arr1[i] == arr2[i]){
				arr4[i] = arr3[i];
			} else if(arr1[i] == arr3[i]) {
				arr4[i] = arr2[i];
			} else if(arr2[i] == arr3[i]){
				arr4[i] = arr1[i];
			}
		}
		System.out.println(arr4[0] + " " + arr4[1]);
	}
}
