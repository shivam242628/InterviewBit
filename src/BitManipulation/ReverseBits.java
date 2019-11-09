package BitManipulation;

import java.util.Scanner;

public class ReverseBits {

    public static long reverse(long a) {
        String str = Long.toBinaryString(a);
        String zeroes = "";
        for(int i=0; i < 32 - str.length(); i++) {
            zeroes += "0";
        }
        str = zeroes + str;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return Long.parseLong(sb.toString(), 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        System.out.println(reverse(a));
    }
}
