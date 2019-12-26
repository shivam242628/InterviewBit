package Trees;

public class IdenticalBinaryTrees {

    public boolean checkIfSame(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (A == null || B == null) {
            return false;
        }

        return (A.val == B.val) && checkIfSame(A.left, B.left) && checkIfSame(A.right, B.right);
    }

    public int isSameTree(TreeNode A, TreeNode B) {
        boolean result = checkIfSame(A,B);
        if (result) {
            return 1;
        }
        return 0;
    }
}
