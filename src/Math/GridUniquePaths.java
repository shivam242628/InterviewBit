package Math;

public class GridUniquePaths {
    public int nCr(int n, int r){
        if(r == 0 || n==r){
            return 1;
        } else {
            return nCr(n-1,r) + nCr(n-1,r-1);
        }
    }
    public int uniquePaths(int A, int B) {
        return nCr(A+B-2, A-1);
    }
}
