package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumUnsortedSubarray {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {

        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = true;
        int start = -1, end = -1;
        ArrayList<Integer> temp = new ArrayList<>(A);
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            if (!A.get(i).equals(temp.get(i))) {
                start = i;
                flag = false;
                break;
            }
        }
        if (!flag) {
            for (int i = A.size() - 1; i >= 0; i--) {
                if (!A.get(i).equals(temp.get(i))) {
                    end = i;
                    break;
                }
            }
            res.add(start);
            res.add(end);
            return res;
        } else {
            res.add(-1);
            return res;
        }
    }
}
