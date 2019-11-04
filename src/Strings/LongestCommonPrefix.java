/*
Given the array of strings A,
you need to find the longest string S which is the prefix of ALL the strings in the array.
Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1
and S2.
For Example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".


Input Format
The only argument given is an array of strings A.
Output Format
Return longest common prefix of all strings in A.
For Example
Input 1:
    A = ["abcdefgh", "aefghijk", "abcefgh"]
Output 1:
    "a"
    Explanation 1:
        Longest common prefix of all the strings is "a".

Input 2:
    A = ["abab", "ab", "abcd"];
Output 2:
    "ab"
    Explanation 2:
        Longest common prefix of all the strings is "ab".
 */

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] A) {
        int length = A.length;
        Arrays.sort(A);
        int min = Math.min(A[0].length(), A[length-1].length());
        int i=0;
        for(i=0; i<min; i++) {
            if(A[0].charAt(i) != A[length-1].charAt(i)) {
                break;
            }
        }
        return A[0].substring(0,i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] A = new String[n];
        scanner.nextLine();
        for(int i=0; i<n; i++) {
            A[i] = scanner.nextLine();
        }
        System.out.println(longestCommonPrefix(A));
    }
}
