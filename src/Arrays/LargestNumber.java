package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static class SortNumbers implements Comparator<String> {

        public int compare(String a, String b) {
            String X = a + b;
            String Y = b + a;

            if (X.compareTo(Y) > 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static String largestNumber(final int[] A) {
        String[] numbers = new String[A.length];
        for (int i = 0; i<A.length; i++) {
            numbers[i] = Integer.toString(A[i]);
        }
        Arrays.sort(numbers,new SortNumbers());
        StringBuilder larNumber = new StringBuilder();
        for (int i=0; i < A.length; i++) {
            larNumber.append(numbers[i]);
        }
        String s = larNumber.toString();
        if (s.charAt(0) == '0') {
            return "0";
        }
        return s;
    }
}
