package ToptalPrep;

import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {

        Candies candies = new Candies();
        System.out.println(Arrays.toString(candies.distributeCandies(7, 4)));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];

        int i = 1;
        int index = 0;
        while (candies > 0) {
            if (candies - i > 0) {
                ans[index++] += i;
            } else {
                ans[index++] += candies;
            }
            candies -= i;
            i++;
            if (index == num_people) index = 0;
        }

        return ans;

    }
}
