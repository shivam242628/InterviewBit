/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
Example:
Given s = "Hello World",
return 5 as length("World") = 5.
*/

package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LengthOfLastWord {

    public static int lengthOfLastWord(final String A) {
        StringTokenizer tokenizer = new StringTokenizer(A," ");
        String word = new String("");

        while(tokenizer.hasMoreElements()) {
            word = "" + tokenizer.nextElement();
        }
        return word.length();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
