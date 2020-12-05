package ToptalPrep;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = -1;
        for (int j : candies) {
            max = Math.max(max, j);
        }

        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }

        return result;

    }
}
