package Strings;

public class ImplementStrStr {

    public int strStr(final String A, final String B) {
        int lengthA = A.length();
        int lengthB = B.length();

        if (lengthB > lengthA || (lengthA == lengthB && !A.equals(B))) {
            return -1;
        }
        int iterations = lengthA - lengthB + 1;

        for (int i=0; i<iterations; i++) {
            if (B.equals(A.substring(i, lengthB + i))) {
                return i;
            }
        }
        return -1;
    }

}
