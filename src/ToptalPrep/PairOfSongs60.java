package ToptalPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PairOfSongs60 {

    public int numPairsDivisibleBy60(int[] time) {
        int pairs = 0;

        HashMap<Integer, ArrayList<Integer>> remainderMap = new HashMap<>();

        HashSet<Integer> foundPair = new HashSet<>();

        for (int i : time) {
            int remainder = Math.abs(((i % 60) - 60));
            ArrayList<Integer> list = remainderMap.getOrDefault(remainder, new ArrayList<>());

            list.add(i);

            remainderMap.put(remainder, list);
        }


        for (int i : time) {
            int remainder = Math.abs(((i % 60) - 60));
            int pair = 60 - remainder;

            if (foundPair.contains(remainder)) {
                continue;
            }

            foundPair.add(pair);

            if (remainder == 30 || remainder == 60) {
                pairs += getPairs(remainderMap.get(remainder).size() - 1);
            } else if (remainderMap.get(remainder)!=null && remainderMap.get(pair) !=null) {

                pairs += remainderMap.get(remainder).size() * remainderMap.get(pair).size();
            }
        }

        return pairs;
    }

    // (n/2) (2+(n-1))
    private int getPairs(int i) {
        return (i*(i+1))/2;
    }
}
