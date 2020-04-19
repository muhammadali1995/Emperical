package InterviewPrep.Solutions;

import java.util.HashMap;

public class FirstUniqueCharacterString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mapOfLetters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int val = 0;
            if (mapOfLetters.containsKey(s.charAt(i)))
                val = mapOfLetters.get(s.charAt(i));

            mapOfLetters.put(s.charAt(i), ++val);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mapOfLetters.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
