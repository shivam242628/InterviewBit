package Arrays;

import java.util.ArrayList;

public class FindPermutation {

    public ArrayList<Integer> findPerm(final String A, int B) {

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> sortedNumbers = new ArrayList<>();

        for (int i=1; i<=B; i++) {
            sortedNumbers.add(i);
        }

        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) == 'I') {
                result.add(sortedNumbers.get(0));
                sortedNumbers.remove(0);
            } else if (A.charAt(i) == 'D') {
                result.add(sortedNumbers.get(sortedNumbers.size()-1));
                sortedNumbers.remove(sortedNumbers.size()-1);
            }
        }
        result.add(sortedNumbers.get(0));
        return result;
    }
}
