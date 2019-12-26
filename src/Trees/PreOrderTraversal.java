package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
    ArrayList<Integer> preorderList;

    public void createPreorderList(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(A);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            preorderList.add(temp.val);

            if (temp.right != null) {
                stack.add(temp.right);
            }

            if (temp.left != null) {
                stack.add(temp.left);
            }

        }

    }
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        preorderList = new ArrayList<>();
        createPreorderList(A);
        return preorderList;
    }
}
