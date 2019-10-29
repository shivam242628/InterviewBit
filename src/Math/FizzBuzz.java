/*
Given a positive integer A, return an array of strings with all the integers from 1 to N.
But for multiples of 3 the array should have “Fizz” instead of the number.
For the multiples of 5, the array should have “Buzz” instead of the number.
For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

Look at the example for more details.

Example

A = 5
Return: [1 2 Fizz 4 Buzz]
 */

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
