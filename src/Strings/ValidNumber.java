package Strings;

public class ValidNumber {
    public int isNumber(final String S) {
        String A = S.trim();
        int length = A.length();
        if(length == 0 || !Character.isDigit(A.charAt(length-1))) {
            return 0;
        }
        int index = 0;
        if(A.charAt(0) == '-') {
            index++;
        }
        int eCount = 0, dotCount = 0;
        for (int i=index; i<length; i++) {
            if(Character.isDigit(A.charAt(i))) {
                continue;
            } else {
                if ((A.charAt(i) == 'e' && A.charAt(i-1) != '.' && eCount == 0) || (A.charAt(i) == '-' && A.charAt(i-1) == 'e')) {
                    eCount++;
                } else if (A.charAt(i) == '.' && dotCount == 0 && eCount == 0) {
                    dotCount++;
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
}
