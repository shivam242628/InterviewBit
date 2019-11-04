/*
Given a string S, find the longest palindromic substring in S.
Substring of string S:
S[i...j] where 0 <= i <= j < len(S)
Palindrome string:
A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.
Incase of conflict, return the substring which occurs first ( with the least starting index ).
Example :
Input : "aaaabaaa"
Output : "aaabaaa"
 */

package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    private static String palindromeString;
    private static int palindromeLength;

    public static void findLongestPalindrome(String A, int i, int j) {
        String palindrome = A.substring(i,j+1);
        int length = j-i+1;
        while(i>=0 && j<A.length()) {
            if(i-1>=0 && j+1<A.length() && A.charAt(i-1) == A.charAt(j+1)) {
                i--;
                j++;
                length = j-i+1;
                palindrome = A.substring(i,j+1);
                if(length > palindromeLength) {
                    palindromeLength = length;
                    palindromeString = A.substring(i,j+1);
                }
            } else {
                if(length > palindromeLength) {
                    palindromeLength = length;
                    palindromeString = A.substring(i,j+1);
                }
                break;
            }
        }
    }

    public static String longestPalindrome(String s) {
        try {
            palindromeString = new String("");
            palindromeLength = 0;


            for(int i=0; i<s.length()-1; i++) {
                if(i-1 >= 0 && i+1 < s.length() && s.charAt(i-1) == s.charAt(i+1)) {
                    findLongestPalindrome(s, i-1, i+1);
                }
                if(s.charAt(i) == s.charAt(i+1)) {
                    findLongestPalindrome(s,i,i+1);
                }
            }
            if(palindromeString.equals("")) {
                return Character.toString(s.charAt(0));
            }
            return palindromeString;
        } catch(Exception e) {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(longestPalindrome(s));
    }

}
