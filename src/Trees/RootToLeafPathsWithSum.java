package Trees;

import java.util.ArrayList;

public class RootToLeafPathsWithSum {

    public ArrayList<ArrayList<Integer>> lists;

    public void makePath(TreeNode A, int B, ArrayList<Integer> path) {
        if (A == null) {
            return;
        }
        path.add(A.val);
        if (A.left == null && A.right == null && A.val-B == 0) {
            lists.add(path);
            return;
        } else {
            ArrayList<Integer> leftPath = new ArrayList<>(path);
            ArrayList<Integer> rightPath = new ArrayList<>(path);
            makePath(A.left, B - A.val, leftPath);
            makePath(A.right, B - A.val, rightPath);
        }
    }

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        lists = new ArrayList<ArrayList<Integer>>();
        if (A == null) {
            return lists;
        } else {
            ArrayList<Integer> path = new ArrayList<>();
            makePath(A, B, path);
        }
        return lists;
    }
}
