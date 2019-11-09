/*
Given an array of non negative integers A, and a range (B, C),
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

 NOTE : The answer is guaranteed to fit in a 32 bit signed integer.
 */

package JumpToLevelProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NUMRANGE {

    public static int numRange(ArrayList<Integer> A, int B, int C) {
        int sum = 0;
        int counter = 0;

        for(int i=0; i<A.size(); i++) {
            sum = 0;
            for(int j=i; j<A.size(); j++) {
                sum += A.get(j);
                if(sum >= B && sum <= C) {
                    counter++;
                }
                if(sum > C) {
                    break;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(5);
        A.add(1);
        A.add(0);
        A.add(2);
        int B = 6;
        int C = 8;
        System.out.println(numRange(A,B,C));
    }
}
