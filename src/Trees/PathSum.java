package Trees;

public class PathSum {
    public boolean checkForPath(TreeNode A, int B) {
        if (A == null) {
            return false;
        }
        if (A.left == null && A.right == null && A.val == B) {
            return true;
        }
        return checkForPath(A.left, B - A.val) || checkForPath(A.right, B - A.val);
    }

    public int hasPathSum(TreeNode A, int B) {
        if (checkForPath(A, B)) {
            return 1;
        }
        return 0;
    }
}
