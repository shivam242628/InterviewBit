package Trees;

public class SumRootToLeafNumbers {

    public int sum = 0;

    public void alterTree(TreeNode A) {
        if (A.left == null && A.right == null) {
            sum = (sum + A.val) % 1003;
        }

        if (A.left != null) {
            String stringNum = String.valueOf(A.val) + String.valueOf(A.left.val);
            int num = Integer.valueOf(stringNum) % 1003;
            A.left.val = num;
            alterTree(A.left);
        }

        if (A.right != null) {
            String stringNum = String.valueOf(A.val) + String.valueOf(A.right.val);
            int num = Integer.valueOf(stringNum) % 1003;
            A.right.val = num;
            alterTree(A.right);
        }
    }

    public int sumNumbers(TreeNode A) {
        alterTree(A);
        return sum;
    }
}
