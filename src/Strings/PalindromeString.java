/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Example:
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */

package Strings;

import java.util.Scanner;

public class PalindromeString {

    public static int isPalindrome(String A) {
        int i=0, j=A.length()-1;
        while(i <= j) {
            if(!(Character.isDigit(A.charAt(i)) || Character.isLetter(A.charAt(i)))) {
                i++;
                continue;
            }
            if(!(Character.isDigit(A.charAt(j)) || Character.isLetter(A.charAt(j)))) {
                j--;
                continue;
            }
            if(Character.toLowerCase(A.charAt(i)) != Character.toLowerCase(A.charAt(j))) {
                return 0;
            }
            else {
                i++;
                j--;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }
}
