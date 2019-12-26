package Strings;

public class AmazingSubarrays {

    public int solve(String A) {
        int result = 0;
        int length = A.length();
        for (int i=0; i<length; i++) {
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U' || A.charAt(i) == 'E') {
                result = (result + length - i) % 10003;
            }
        }
        return result;
    }

}
