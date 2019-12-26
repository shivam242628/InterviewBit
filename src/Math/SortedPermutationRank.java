package Math;

import java.util.ArrayList;
import java.util.Collections;

public class SortedPermutationRank {

    public int fact(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact = (fact * i) % 1000003 ;
        }
        return fact;
    }

    public int findRank(String A) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i=0; i<A.length(); i++) {
            list.add(A.charAt(i));
        }
        Collections.sort(list);
        int rank = 0;
        int i = 0;
        while (list.size() != 1) {
            char c = A.charAt(i++);
            int index = list.indexOf(c);
            rank += (index * fact(list.size()-1)) % 1000003;
            list.remove(index);
        }
        return (rank+1) % 1000003;
    }
}
