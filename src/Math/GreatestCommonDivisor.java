/*
Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.
Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3
 */

package Math;

import java.util.Scanner;

public class GreatestCommonDivisor {

    private static Scanner scanner = new Scanner(System.in);

    public int gcd(int A, int B) {

        return (B == 0) ? A : gcd(B, A%B);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(obj.gcd(A, B));

    }

}
