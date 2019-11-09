package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinXORValue {
    public static int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.size() - 1; i++) {
            int xorValue = A.get(i) ^ A.get(i+1);
            if(xorValue < min) {
                min = xorValue;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(2);
        A.add(5);
        A.add(7);
        System.out.println(findMinXor(A));
    }
}
