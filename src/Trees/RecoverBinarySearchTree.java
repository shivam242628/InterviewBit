package Trees;

import java.util.ArrayList;

public class RecoverBinarySearchTree {

    public ArrayList<Integer> inOrderList;

    public void inOrder(TreeNode A) {
        if(A == null) {
            return;
        }
        inOrder(A.left);
        inOrderList.add(A.val);
        inOrder(A.right);
    }

    public ArrayList<Integer> recoverTree(TreeNode A) {
        inOrderList = new ArrayList<>();
        inOrder(A);
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        for(int i=0; i<inOrderList.size() - 1; i++) {
            if(inOrderList.get(i) > inOrderList.get(i+1)) {
                result.add(inOrderList.get(i));
                result.add(0,inOrderList.get(i+1));
                index = i;
                break;
            }
        }
        for(int j = index + 1; j < inOrderList.size() - 1; j++) {
            if(inOrderList.get(j) > inOrderList.get(j+1) && result.size() == 2) {
                result.set(0,inOrderList.get(j+1));
                break;
            }
        }
        return result;
    }
}
