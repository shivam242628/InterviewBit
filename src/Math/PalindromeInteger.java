/*
Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False
 */

package Math;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        PalindromeInteger obj = new PalindromeInteger();
        System.out.println(obj.isPalindrome(A));
    }

    public int isPalindrome(int A) {
        int reversedNumber = 0;
        int n = A;

        while(n > 0) {
            int temp = n % 10;
            reversedNumber = reversedNumber*10 + temp;
            n = n/10;
        }

        if(A == reversedNumber) {
            return 1;
        }
        return 0;
    }
}
