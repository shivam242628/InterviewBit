package BitManipulation;

public class NumberOf1Bits {

    public int numSetBits(long a) {
        int count = 0;
        String s = Long.toBinaryString(a);

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
