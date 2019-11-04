/*
Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.
The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
Maximum sub-array is defined in terms of the sum of the elements in the sub-array.
Find and return the required subarray.
NOTE:
    1. If there is a tie, then compare with segment's length and return segment which has maximum length.
    2. If there is still a tie, then return the segment with minimum starting index.

Input Format:
The first and the only argument of input contains an integer array A, of length N.
Output Format:
Return an array of integers, that is a subarray of A that satisfies the given conditions.
Constraints:
1 <= N <= 1e5
1 <= A[i] <= 1e5
Examples:
Input 1:
    A = [1, 2, 5, -7, 2, 3]

Output 1:
    [1, 2, 5]

Explanation 1:
    The two sub-arrays are [1, 2, 5] [2, 3].
    The answer is [1, 2, 5] as its sum is larger than [2, 3].

Input 2:
    A = [10, -1, 2, 3, -4, 100]

Output 2:
    [100]

Explanation 2:
    The three sub-arrays are [10], [2, 3], [100].
    The answer is [100] as its sum is larger than the other two.
 */

package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum = 0;
        long superSum = 0;
        ArrayList<Integer> tempArr = new ArrayList<>();
        ArrayList<Integer> finalArr = new ArrayList<>();

        for(int i=0; i<A.size(); i++) {
            sum+=A.get(i);
            if(sum >= 0 && A.get(i) >= 0) {
                tempArr.add(A.get(i));
            }
            if(sum >= superSum) {
                if(sum == superSum) {
                    if(tempArr.size() >= finalArr.size()) {
                        finalArr = new ArrayList<Integer>(tempArr);
                    }
                } else {
                    finalArr = new ArrayList<Integer>(tempArr);
                }
                superSum = sum;
            }
            if(sum < 0 || A.get(i) < 0) {
                sum = 0;
                tempArr = new ArrayList<>();
            }
        }
        return finalArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(maxset(list));
    }
}
