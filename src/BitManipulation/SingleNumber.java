package BitManipulation;

import java.util.List;

public class SingleNumber {

    public int singleNumber(final List<Integer> A) {
        int result = 0;
        for (Integer i : A) {
            result = result ^ i;
        }
        return result;
    }
}
