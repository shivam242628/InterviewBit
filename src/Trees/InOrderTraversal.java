package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
    static ArrayList<Integer> inorderList;

    public void createInorderList(TreeNode A) {
        TreeNode curr = A;
        Stack<TreeNode> stack = new Stack<>();

        while (!(stack.isEmpty() && curr == null)) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            TreeNode temp = stack.pop();
            inorderList.add(temp.val);
            curr = temp.right;
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        inorderList = new ArrayList<>();
        createInorderList(A);
        return inorderList;
    }
}
