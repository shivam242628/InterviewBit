package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {

    public static Stack<TreeNode> stack;

    public void createStack(TreeNode A) {
        if (A == null) {
            return;
        }
        stack.push(A);
        if (A.left != null) {
            createStack(A.left);
        }
        if (A.right != null) {
            createStack(A.right);
        }
    }

    public TreeNode flatten(TreeNode A) {
        stack = new Stack<>();
        createStack(A);
        ArrayList<TreeNode> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(0, stack.pop());
        }
        TreeNode newRoot = new TreeNode(list.get(0).val);
        TreeNode temp = newRoot;
        for (int i=1; i< list.size(); i++) {
            temp.right = new TreeNode(list.get(i).val);
            temp = temp.right;
        }
        return newRoot;
    }
}
