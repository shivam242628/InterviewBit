/*
You are given two positive numbers A and B. You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
For example,

A = 30
B = 12
We return
X = 5
 */

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
