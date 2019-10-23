package Math;

import java.util.Scanner;

public class GreatestCommonDivisor {

    private static Scanner scanner = new Scanner(System.in);

    public int gcd(int A, int B) {

        return (B == 0) ? A : gcd(B, A%B);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor obj = new GreatestCommonDivisor();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(obj.gcd(A, B));

    }

}
