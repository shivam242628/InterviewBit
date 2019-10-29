/*
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
 */

package Math;

import java.util.Scanner;

public class ExcelColumnTitle {

    public static String convertToTitle(int A) {
        String columnTitle = new String("");

        while(A>0) {
            int temp = A%26;
            if(temp != 0) {
                columnTitle = (char)(temp + 64) + columnTitle;
                A = A/26;
            }
            else {
                columnTitle = 'Z' + columnTitle;
                A = A/26 - 1;
            }

        }
        if(A > 0) {
            columnTitle = (char)(A+64) + columnTitle;
        }

        return columnTitle;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.println(convertToTitle(A));
    }
}
