package ToptalPrep;

import java.util.ArrayList;
import java.util.HashMap;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();
        System.out.println(degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    public int findShortestSubArray(int[] nums) {


        HashMap<Integer, int[]> range = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = 0;
        int minSubArray = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {


            int currCount = count.getOrDefault(nums[i], 0) + 1;

            if (max < currCount) {
                minSubArray = nums.length + 1;
            }
            int[] existing = range.get(nums[i]);
            if (existing != null) {
                existing[1] = i;
            } else {
                existing = new int[]{i, i};
            }
            range.put(nums[i], existing);

            max = Math.max(currCount, max);

            if (currCount == max) {
                minSubArray = Math.min(minSubArray, (existing[1] - existing[0]));
            }

            count.put(nums[i], currCount);


        }

        return minSubArray + 1;

    }
}
