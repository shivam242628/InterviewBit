package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int i = 1;
        while(i < A.size()) {
            int temp1 = A.get(i);
            int temp2 = A.get(i-1);
            A.set(i,temp2);
            A.set(i-1,temp1);
            i+=2;
        }
        return A;
    }
}
