package Arrays;

public class SpiralOrderMatrixII {
    public static int[][] result;
    public static int A;
    public int[][] generateMatrix(int n) {
        result = new int[n][n];
        A = n;
        result[0][0] = 1;
        fillHorizontalRight(0,1,2);
        return result;
    }

    public static void fillHorizontalRight(int i, int j, int num) {

        if (num-1 == A*A) {
            return;
        }

        while (i < A && j < A && result[i][j] == 0) {
            result[i][j] = num;
            num++;
            j++;
        }
        fillVerticalDown(i+1,j-1,num);
    }

    public static void fillVerticalDown(int i, int j, int num) {

        if (num-1 == A*A) {
            return;
        }

        while (i < A && j < A && result[i][j] == 0) {
            result[i][j] = num;
            num++;
            i++;
        }
        fillHorizontalLeft(i-1,j-1,num);
    }

    public static void fillHorizontalLeft(int i, int j, int num) {

        if (num-1 == A*A) {
            return;
        }

        while (i >= 0 && j >= 0 && result[i][j] == 0) {
            result[i][j] = num;
            num++;
            j--;
        }
        fillVerticalUp(i-1,j+1,num);
    }

    public static void fillVerticalUp(int i, int j, int num) {

        if (num-1 == A*A) {
            return;
        }

        while (i >= 0 && j >= 0 && result[i][j] == 0) {
            result[i][j] = num;
            num++;
            i--;
        }
        fillHorizontalRight(i+1,j+1,num);
    }

    public static void main(String[] args) {
        //send a matrix from here
    }
}
