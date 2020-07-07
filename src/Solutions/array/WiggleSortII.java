package Solutions.array;

import java.util.Arrays;

public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        if (nums.length <= 1) return;

        Arrays.sort(nums);
        int[] aux = new int[nums.length];
        int j = 0;
        int k = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            aux[i] = nums[i];
        }
        for (int i = 0; i < nums.length - 1; i += 2) {
            nums[i] = aux[j];
            if (k < nums.length) nums[i + 1] = aux[k];
            j++;
            k++;
        }

        if (nums.length % 2 == 1 && nums[nums.length - 1] > nums[nums.length - 2]) {
            int temp = nums[nums.length - 1];
            nums[nums.length - 1] = nums[nums.length - 2];
            nums[nums.length - 2] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
