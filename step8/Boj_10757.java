package step8;

import java.math.BigInteger;
import java.util.Scanner;

public class Boj_10757 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        sc.close();
        
        System.out.println(A.add(B));
    }
}
