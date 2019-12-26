package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingInteger {

    public int firstMissingPositive(ArrayList<Integer> A) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<A.size(); i++) {
            set.add(A.get(i));
        }
        int i=1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
    }
}
