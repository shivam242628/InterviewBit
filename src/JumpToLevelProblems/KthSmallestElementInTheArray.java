/*
Find the kth smallest element in an unsorted array of non-negative integers.

Definition of kth smallest element

 kth smallest element is the minimum possible n such that there are at least k elements in the array <= n.
In other words, if the array A was sorted, then A[k - 1] ( k is 1 based, while the arrays are 0 based )
NOTE
You are not allowed to modify the array ( The array is read only ).
Try to do it using constant extra space.

Example:

A : [2 1 4 3 2]
k : 3

answer : 2
 */


package JumpToLevelProblems;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KthSmallestElementInTheArray {

    public static int kthsmallest(final List<Integer> A, int B) {
        Collections.sort(A);
        return A.get(B - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(4);
        A.add(3);
        A.add(2);
        int k = scanner.nextInt();
        System.out.println(kthsmallest(A,k));
    }
}
