package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class RepeatAndMissingNumberArray {

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer x : A) {
            if (set.contains(x)) {
                result.add(x);
            } else {
                set.add(x);
            }
        }

        for (int i=1; i<=A.size(); i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(repeatedNumber(list));
    }
}
