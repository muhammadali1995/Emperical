package Solutions.array;

import java.util.Arrays;

public class RotateArrayK {
    public void rotate(int[] nums, int k) {
        int[] helper = new int[nums.length];
        for (int i = 0; i < helper.length; i++) {
            helper[i] = nums[i];
        }
        k = k%nums.length;
        for (int i = 0; i < k; i++) {
            nums[i] = helper[nums.length - k + i];
        }

        int j = 0;
        for (int i = k; i <nums.length; i++) {
            nums[i] = helper[j++];
        }
    }
}
