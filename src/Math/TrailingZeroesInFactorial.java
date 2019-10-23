package Math;

import java.util.Scanner;

public class TrailingZeroesInFactorial {

    public int trailingZeroes(int A) {
        int result = 0;
        int temp = 5;
        while(A/temp > 0) {
            result = result + A/temp;
            temp = temp*5;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int A = scanner.nextInt();
        TrailingZeroesInFactorial obj = new TrailingZeroesInFactorial();
        System.out.println(obj.trailingZeroes(A));
    }

}
