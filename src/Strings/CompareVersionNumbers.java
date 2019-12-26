package Strings;

import java.math.BigInteger;
import java.util.StringTokenizer;

public class CompareVersionNumbers {
    public int compareVersion(String A, String B) {

        StringTokenizer st1 = new StringTokenizer(A,".");
        StringTokenizer st2 = new StringTokenizer(B,".");

        while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
            String token1 = st1.nextToken();
            String token2 = st2.nextToken();
            BigInteger b1 = new BigInteger(token1);
            BigInteger b2 = new BigInteger(token2);
            if (b1.compareTo(b2) == 1) {
                return 1;
            } else if(b1.compareTo(b2) == -1) {
                return -1;
            }
        }

        if (st1.hasMoreTokens()) {
            while (st1.hasMoreTokens()) {
                String token = st1.nextToken();
                BigInteger b = new BigInteger(token);
                if (b.compareTo(BigInteger.ZERO) != 0) {
                    return 1;
                }
            }
        }
        if (st2.hasMoreTokens()) {
            while (st2.hasMoreTokens()) {
                String token = st2.nextToken();
                BigInteger b = new BigInteger(token);
                if (b.compareTo(BigInteger.ZERO) != 0) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
