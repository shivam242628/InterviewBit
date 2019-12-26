package Trees;

public class MinDepthOfBinaryTree {
    public int minDepth(TreeNode A) {
        if (A.left == null && A.right == null) {
            return 1;
        }

        if (A.left == null) {
            return 1 + minDepth(A.right);
        } else if (A.right == null) {
            return 1 + minDepth(A.left);
        } else {
            return 1 + Math.min(minDepth(A.left), minDepth(A.right));
        }
    }
}
