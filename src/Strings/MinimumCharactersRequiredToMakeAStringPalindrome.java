package Strings;

public class MinimumCharactersRequiredToMakeAStringPalindrome {
    public boolean isPalindrome(String A) {
        int l = A.length() - 1;
        int i=0;
        while (i < l) {
            if (A.charAt(i) != A.charAt(l)) {
                return false;
            }
            i++;
            l--;
        }
        return true;
    }

    public int solve(String A) {
        if (isPalindrome(A)) {
            return 0;
        }
        int length = A.length();
        int prefixPalindromeLength = 1;
        for (int i = 1; i < length; i++) {
            if (isPalindrome(A.substring(0,i))) {
                prefixPalindromeLength = i;
            }
        }
        return length - prefixPalindromeLength;
    }
}
