package Solutions.array;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int size = s.length();
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (sMap.size() == tMap.size()) {
            for (int i = 0; i < size; i++) {
                int sSize = sMap.get(s.charAt(i));
                int tSize = tMap.get(t.charAt(i));
                if (tSize != sSize) {
                    return false;
                } else {
                    sMap.put(s.charAt(i), sSize - 1);
                    tMap.put(t.charAt(i), sSize - 1);
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
