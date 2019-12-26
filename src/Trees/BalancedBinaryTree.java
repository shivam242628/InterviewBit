package Trees;

public class BalancedBinaryTree {

    public int calculateHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(calculateHeight(node.left), calculateHeight(node.right));
    }

    public boolean isTreeBalanced(TreeNode A) {
        if (A == null) {
            return true;
        }

        int leftHeight = 1 + calculateHeight(A.left);
        int rightHeight = 1 + calculateHeight(A.right);
        if (Math.abs(leftHeight - rightHeight) < 2) {
            return isTreeBalanced(A.left) && isTreeBalanced(A.right);
        }

        return false;
    }

    public int isBalanced(TreeNode A) {

        if (isTreeBalanced(A)) {
            return 1;
        }
        return 0;
    }
}
