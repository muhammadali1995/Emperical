package ToptalPrep;

import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewelSet = new HashSet<>();
        int counter = 0;
        for (char j : J.toCharArray()) {
            jewelSet.add(j);
        }

        for (char s : S.toCharArray()) {
            if (jewelSet.contains(s)) counter++;
        }

        return counter;
    }
}
