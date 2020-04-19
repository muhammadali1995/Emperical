package InterviewPrep.Solutions;

import java.util.HashMap;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int kindCandiesSisterGet = 0;
        HashMap<Integer, Integer> kindsOfCandiesWithCount = new HashMap<>();
        for (int i = 0; i < candies.length; i++) {
            int count = 0;
            if (kindsOfCandiesWithCount.containsKey(candies[i])) {
                count = kindsOfCandiesWithCount.get(candies[i]);
            }
            count++;
            kindsOfCandiesWithCount.put(candies[i], count);
        }

        boolean isSistersTurn = true;
        for (int key : kindsOfCandiesWithCount.keySet()) {
            if (kindsOfCandiesWithCount.get(key) % 2 == 0) {
                kindCandiesSisterGet++;
            } else {
                if (isSistersTurn) {
                    kindCandiesSisterGet++;
                    if (kindsOfCandiesWithCount.get(key) / 2 >= 1) kindCandiesSisterGet++;
                    isSistersTurn = false;
                } else {
                    if (kindsOfCandiesWithCount.get(key) / 2 >= 1) {
                        kindCandiesSisterGet++;
                    }else {
                        isSistersTurn = true;
                    }
                }
            }
        }

        return kindCandiesSisterGet;
    }
}
