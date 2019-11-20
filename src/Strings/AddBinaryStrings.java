package Strings;

public class AddBinaryStrings {
    public String addBinary(String A, String B) {
        String result = "";
        String bigString = (A.length() > B.length()) ? A : B;
        String smallString = (A.length() <= B.length()) ? A : B;
        int i = bigString.length() - 1;
        int j = smallString.length() - 1;
        int x = Math.min(i,j) + 1;
        boolean isCarry = false;
        while(x-- > 0){
            if(isCarry) {
                if(bigString.charAt(i) == '1' && smallString.charAt(j) == '1'){
                    result = '1' + result;
                    isCarry = true;
                } else if(bigString.charAt(i) == '1' || smallString.charAt(j) == '1') {
                    result = '0' + result;
                    isCarry = true;
                } else {
                    result = '1' + result;
                    isCarry = false;
                }
            } else {
                if(bigString.charAt(i) == '1' && smallString.charAt(j) == '1'){
                    result = '0' + result;
                    isCarry = true;
                } else if(bigString.charAt(i) == '1' || smallString.charAt(j) == '1') {
                    result = '1' + result;
                    isCarry = false;
                } else {
                    result = '0' + result;
                    isCarry = false;
                }
            }
            i--;
            j--;
        }
        for(int z = i; z >=0; z--) {
            if(isCarry) {
                if(bigString.charAt(z) == '1') {
                    result = '0' + result;
                    isCarry = true;
                } else {
                    result = '1' + result;
                    isCarry = false;
                }
            } else {
                result = bigString.charAt(z) + result;
            }
        }
        if(isCarry) {
            result = '1' + result;
        }
        return result;
    }
}
