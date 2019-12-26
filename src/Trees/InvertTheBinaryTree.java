package Trees;

public class InvertTheBinaryTree {

    public void invert(TreeNode A) {
        if (A == null) {
            return;
        }
        invert(A.left);
        invert(A.right);

        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
    }

    public TreeNode invertTree(TreeNode A) {
        invert(A);
        return A;
    }

}
