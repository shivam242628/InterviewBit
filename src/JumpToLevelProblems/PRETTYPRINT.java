/*
Print concentric rectangular pattern in a 2d matrix.
Let us show you some examples to clarify what we mean.
Example 1:
Input: A = 4.
Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
Example 2:
Input: A = 3.
Output:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.
You will be given A as an argument to the function you need to implement, and you need to return a 2D array.
See Expected Output
 */


package JumpToLevelProblems;

import java.util.Scanner;

public class PRETTYPRINT {
    public static int[][] prettyPrint(int A) {
        Scanner scanner = new Scanner(System.in);

        int n = 2*A-1;
        int[][] result = new int[n][n];
        int rs = 0, re = n-1;
        int cs = 0, ce = n-1;
        A =A+1;

        while(A-- > 0) {
            for(int i = cs; i<= ce; i++) {
                result[rs][i] = A;
                result[re][i] = A;
            }

            for(int i = rs+1; i<=re-1; i++) {
                result[i][cs] = A;
                result[i][ce] = A;
            }
            cs++;
            ce--;
            rs++;
            re--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int[][] result = prettyPrint(A);
        for(int i=0; i<2*A-1;i++) {
            for(int j=0; j<2*A-1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
