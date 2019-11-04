/*
You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
For example,
A=[1, 3, -1]

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
 */

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumAbsoluteDifference {
    public static int maxArr(ArrayList<Integer> A) {
        int maxPlus = Integer.MIN_VALUE, minPlus = Integer.MAX_VALUE;
        int maxMinus = Integer.MIN_VALUE, minMinus = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            final int plus = A.get(i) + i;
            if(plus > maxPlus){
                maxPlus = plus;
            }
            if(plus < minPlus){
                minPlus = plus;
            }
            final int minus = A.get(i) - i;
            if(minus > maxMinus){
                maxMinus = minus;
            }
            if(minus < minMinus){
                minMinus = minus;
            }
        }
        return Math.max(maxPlus - minPlus, maxMinus - minMinus);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(maxArr(list));
    }
}
