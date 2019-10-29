
/*
Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1

    B -> 2

    C -> 3

    ...

    Z -> 26

    AA -> 27

    AB -> 28
 */
package Math;

import java.util.Scanner;

public class ExcelColumnNumber {

    public static int titleToNumber(String A) {
        int result = 0;

        char[] charArray = A.toCharArray();
        int length = A.length();

        for(int i=length - 1; i>=0; i--) {
            result = result + ((int)charArray[i] - 64) * (int)Math.pow(26,length - (i+1));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(titleToNumber(s));
    }

}
