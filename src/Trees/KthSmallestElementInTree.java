package Trees;

import java.util.ArrayList;

public class KthSmallestElementInTree {

    ArrayList<Integer> inorderList;

    public void inorder(TreeNode A) {
        if(A == null) {
            return;
        }
        inorder(A.left);
        inorderList.add(A.val);
        inorder(A.right);
    }

    public int kthsmallest(TreeNode A, int B) {
        inorderList = new ArrayList<>();
        inorder(A);

        while(B-- > 1) {
            inorderList.remove(0);
        }

        return inorderList.get(0);
    }
}
