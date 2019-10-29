package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*

Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.
 */

public class AddOneToNumber {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int length = A.size();
        boolean isCarry = false;
        boolean isZeroSignificant = false;

        // adding 1 to the last element and taking the carry leftwards until we hit a digit that is not 9.
        for(int i = length - 1; i>=0; i--) {
            if(A.get(i) == 9) {
                A.set(i, 0);
                isCarry = true;
            }
            else {
                A.set(i, A.get(i) + 1);
                isCarry = false;
                break;
            }
        }

        // to add a 1 at the beginning, if all elements of arrayList were 9
        if(isCarry) {
            A.add(0,1);
        }

        for(int i=0; i<A.size(); i++) {
            if(isZeroSignificant == false && A.get(i) == 0) {
                A.remove(i);
                i--;
            }
            else {
                isZeroSignificant = true;
                break;
            }
        };
        return A;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        // random input.... You can try other inputs as well
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(9);
        arrayList =  plusOne(arrayList);
        System.out.println(arrayList);
    }
}
