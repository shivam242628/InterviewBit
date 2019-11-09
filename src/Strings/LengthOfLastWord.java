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
