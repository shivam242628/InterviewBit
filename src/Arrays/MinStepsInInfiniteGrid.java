package Arrays;

import java.util.Scanner;

public class MinStepsInInfiniteGrid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }
        MinStepsInInfiniteGrid obj = new MinStepsInInfiniteGrid();
        System.out.println(obj.coverPoints(A,B));
    }

    public int coverPoints(int[] A, int[] B) {

        int steps = 0;

        for(int i=0; i<A.length-1; i++) {
            if(Math.abs(A[i] - A[i+1]) >= Math.abs(B[i] - B[i+1])) {
                steps+= Math.abs(A[i] - A[i+1]);
            }
            else {
                steps+= Math.abs(B[i] - B[i+1]);
            }
        }
        return steps;
    }
}
