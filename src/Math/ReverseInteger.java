package Math;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(A));
    }



    public int reverse(int A) {
        long reversedNumber = 0;
        long n = (long)A;
        boolean isNegative = false;
        if(n < 0) {
            isNegative = true;
            n = -n;
        }

        while(n > 0) {
            long temp = n%10;
            reversedNumber = reversedNumber*10 + temp;
            n = n/10;
            if(reversedNumber > Integer.MAX_VALUE) {
                return 0;
            }
        }

        A = (int)reversedNumber;

        if(isNegative) {
            return -A;
        }
        return A;

    }
}
