package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        for (int i=0; i < size - 1; i++) {
            if(A.get(i) == A.get(i+1)) {
                continue;
            }
            int p = A.get(i);
            int numbersGreaterThanP = size - i - 1;
            if (p == numbersGreaterThanP) {
                return 1;
            }
        }
        if(A.get(size-1) == 0) {
            return 1;
        }
        return -1;
    }
}
