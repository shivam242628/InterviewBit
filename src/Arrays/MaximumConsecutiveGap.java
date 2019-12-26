package Arrays;

import java.util.Collections;
import java.util.List;

public class MaximumConsecutiveGap {
    public int maximumGap(final List<Integer> A) {
        if (A.size() < 2) {
            return 0;
        }
        Collections.sort(A);
        int maxDifference = Integer.MIN_VALUE;

        for (int i=0; i<A.size()-1; i++) {
            int difference = Math.abs(A.get(i)-A.get(i+1));
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;
    }
}
