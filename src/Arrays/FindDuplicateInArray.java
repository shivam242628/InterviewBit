package Arrays;

import java.util.HashSet;
import java.util.List;

public class FindDuplicateInArray {

    public int repeatedNumber(final List<Integer> A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < A.size(); i++) {
            if(!set.contains(A.get(i))) {
                set.add(A.get(i));
            } else {
                return A.get(i);
            }
        }
        return -1;
    }
}
