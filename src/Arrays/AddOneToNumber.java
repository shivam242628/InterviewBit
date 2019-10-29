package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AddOneToNumber {

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int length = A.size();
        boolean isCarry = false;
        boolean isZeroSignificant = false;

        for(int i = length - 1; i>=0; i--) {
            if(A.get(i) == 9) {
                A.set(i, 0);
                isCarry = true;
            }
            else {
                A.set(i, A.get(i) + 1);
                isCarry = false;
                break;
            }
        }

        if(isCarry) {
            A.add(0,1);
        }

        for(int i=0; i<A.size(); i++) {
            if(isZeroSignificant == false && A.get(i) == 0) {
                A.remove(i);
                i--;
            }
            else {
                isZeroSignificant = true;
                break;
            }
        };

        return A;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(9);
        arrayList =  plusOne(arrayList);
        System.out.println(arrayList);

    }
}
