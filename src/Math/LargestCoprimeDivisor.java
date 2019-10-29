package Math;

import java.util.Scanner;

public class LargestCoprimeDivisor {

    public static int gcd(int A, int B) {
        if(B == 0) {
            return A;
        }
        else {
            return gcd(Math.min(A,B), Math.max(A,B)%Math.min(A,B));
        }
    }
    public static int cpFact(int A, int B) {
        while(gcd(A,B) != 1) {
            A = A/gcd(A,B);
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(cpFact(A,B));
    }
}
