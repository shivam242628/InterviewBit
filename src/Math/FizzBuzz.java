package Math;

import java.util.Scanner;

public class FizzBuzz {
    public String[] fizzBuzz(int A) {

        String[] result = new String[A];

        for(int i=1; i<=A; i++) {
            if(i%3 == 0 && i%5 == 0) {
                result[i-1] = "FizzBuzz";
            }
            else if(i%3 == 0) {
                result[i-1] = "Fizz";
            }
            else if(i%5 == 0) {
                result[i-1] = "Buzz";
            }
            else result[i-1] = Integer.toString(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String[] result = new String[A];
        FizzBuzz obj = new FizzBuzz();
        result = obj.fizzBuzz(A);

        for(int i=0; i<A; i++) {
            System.out.println(result[i]);
        }
    }

}
