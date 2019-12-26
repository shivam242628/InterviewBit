package Arrays;

public class PascalTriangle {

    public static int[][] solve(int A) {
        int[][] result = new int[A][];
        if (A == 0) {
            return result;
        }
        result[0] = new int[1];
        result[0][0] = 1;

        for (int i = 1; i < A; i++) {
            result[i] = new int[i+1];
            result[i][0]=1;
            int size = i+1;
            int j = 1;
            int val = 0;
            if (j < size-1) {
                val = result[i-1][j];
            }
            int temp = result[i-1][j-1] + val;
            while ( j < size && temp != 0) {
                result[i][j] = temp;
                j++;
                val = 0;
                if (j < size-1) {
                    val = result[i-1][j];
                }
                if (j == size) {
                    break;
                }
                temp = result[i-1][j-1] + val;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solve(5);
    }
}
