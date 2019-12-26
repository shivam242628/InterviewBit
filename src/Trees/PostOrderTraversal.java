package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> postOrderList = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(A);

        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) {
                stack1.push(temp.left);
            }

            if (temp.right != null) {
                stack1.push(temp.right);
            }
        }

        while(!stack2.isEmpty()) {
            postOrderList.add(stack2.pop().val);
        }
        return postOrderList;
    }
}
