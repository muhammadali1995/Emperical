package InterviewPrep.Solutions;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i <candies.length ; i++) {
            if (max<candies[i]) max = candies[i];
        }

        List<Boolean> output = new ArrayList<>();
        for (int i = 0; i <candies.length ; i++) {
          if (candies[i]+extraCandies>=max) output.add(true);
          else output.add(false);
        }
        return output;
    }
}
