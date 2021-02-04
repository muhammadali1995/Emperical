package ToptalPrep;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {

    public static void main(String[] args) {
        RelativeRanks relativeRanks = new RelativeRanks();
        relativeRanks.findRelativeRanks(new int[]{10, 3, 8, 9, 4});
    }

    public String[] findRelativeRanks(int[] nums) {

        HashMap<Integer, Integer> indexes = new HashMap<>();

        String[] ans = new String[nums.length];
        int sz = nums.length;
        for (int i = 0; i < nums.length; i++) {
            indexes.put(nums[i], i);
        }
        Arrays.sort(nums);
        int rank = 1;
        for (int i = sz - 1; i >= 0; i--) {
            if (rank == 1) {
                ans[indexes.get(nums[i])] = "Gold Medal";
            } else if (rank == 2) {
                ans[indexes.get(nums[i])] = "Silver Medal";
            } else if (rank == 3) {
                ans[indexes.get(nums[i])] = "Bronze Medal";
            } else {
                ans[indexes.get(nums[i])] = String.valueOf(rank);
            }
            rank++;
        }

        return ans;
    }
}
