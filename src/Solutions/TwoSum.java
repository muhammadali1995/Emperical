package Solutions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
    }

    public int[] optimizedTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public int findMaxIndex(int firstIndex, int[] nums, int target){

        return  0;
    }


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }




}
