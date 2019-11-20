package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigzagString {
    public String convert(String s, int n) {
        if(s.length() == 1 || n == 1){
            return s;
        }
        Map<Integer, List<Character>> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int temp = 1;
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            List<Character> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(ch[i]);
            map.put(temp, list);

            if (check) {
                temp++;
            }
            else {
                temp--;
            }

            if (temp == n + 1) {
                temp-=2;
                check = false;
            }
            if (temp == 1) {
                check = true;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, List<Character>> listEntry : map.entrySet()) {
            for (Character c : listEntry.getValue()) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
