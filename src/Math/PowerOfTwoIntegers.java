package Math;

import java.util.Scanner;

public class PowerOfTwoIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        PowerOfTwoIntegers obj = new PowerOfTwoIntegers();
        System.out.println(obj.isPower(A));
    }

    public int isPower(int A) {
        int x = (int)Math.sqrt(A);
        if(A == 1) {
            return 1;
        }

        for(int i=x; i>=2; i--) {
            if(A % i == 0) {
                for(int j=x; j>=2; j--) {
                    if(Math.pow(i,j) == A) {
                        return 1;
                    }
                }
            } else {
                continue;
            }
        }
        return 0;
    }

}
