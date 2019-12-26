package Arrays;

import java.util.ArrayList;

public class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();

        int size = A.size();
        for (int k=0; k<size; k++) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = 0;
            int j = k;
            while (i < size && j >= 0) {
                list.add(A.get(i).get(j));
                i++;
                j--;
            }
            resultList.add(list);
        }

        for (int k = 1; k < size; k++) {
            ArrayList<Integer> list = new ArrayList<>();
            int i = k;
            int j = size-1;
            while (i < size && j >= 0) {
                list.add(A.get(i).get(j));
                i++;
                j--;
            }
            resultList.add(list);
        }

        return resultList;
    }
}
