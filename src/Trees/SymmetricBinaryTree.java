package Trees;

public class SymmetricBinaryTree {

    public boolean checkIfSymmetrical(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (A == null || B == null) {
            return false;
        }

        return (A.val == B.val) && checkIfSymmetrical(A.left, B.right) && checkIfSymmetrical(A.right, B.left);
    }

    public int isSymmetric(TreeNode A) {
        boolean result = checkIfSymmetrical(A,A);
        if (result) {
            return 1;
        }
        return 0;
    }
}
