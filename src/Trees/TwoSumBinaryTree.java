package Trees;

import java.util.ArrayList;

public class TwoSumBinaryTree {

    ArrayList<Integer> list;

    public void createInorderList(TreeNode A) {
        if (A == null) {
            return;
        }
        createInorderList(A.left);
        list.add(A.val);
        createInorderList(A.right);
    }

    public int t2Sum(TreeNode A, int B) {
        list = new ArrayList<>();
        createInorderList(A);
        while (!list.isEmpty()) {
            int temp = B - list.get(0);
            list.remove(0);
            if (list.contains(temp)) {
                return 1;
            }
        }
        return 0;
    }
}
