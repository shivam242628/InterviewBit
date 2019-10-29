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
