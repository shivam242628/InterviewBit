/*
Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s conjecture

Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d]

If a < c OR a==c AND b < d.
 */

package Math;

import java.util.Scanner;

public class PrimeSum {

    public static boolean checkPrime(int a) {

        for(int i=2; i<=a/2; i++) {
            if(a%i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int[] primesum(int A) {

        int[] arr = new int[2];

        for(int i=2; i<=A/2; i++) {
            if(checkPrime(i)) {
                if(checkPrime(A-i)) {
                    arr[0] = i;
                    arr[1] = A-i;
                    break;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[2];
        arr = primesum(n);
        System.out.println(arr[0] + " " + arr[1]);

    }
}
