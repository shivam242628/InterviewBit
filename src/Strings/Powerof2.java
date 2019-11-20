package Strings;

import java.math.BigInteger;

public class Powerof2 {
    public String convertToBinary(String A) {
        String binaryString = "";
        BigInteger n = new BigInteger(A);

        while(n.compareTo(BigInteger.valueOf(0)) == 1) {
            BigInteger temp = n.mod(BigInteger.valueOf(2));
            binaryString = temp + binaryString;
            n = n.divide(BigInteger.valueOf(2));
        }
        return binaryString;
    }

    public int power(String A) {
        int oneCount = 0;
        String binaryString = convertToBinary(A);
        if(binaryString.length() == 1){
            return 0;
        }
        for(int i=0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                oneCount++;
                if(oneCount > 1) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
