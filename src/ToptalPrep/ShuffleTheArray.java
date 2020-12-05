package ToptalPrep;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(Arrays.stream(shuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)).toArray()));
    }

    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = 0;
        int[] result = new int[2 * n];
        while (i < nums.length / 2) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
            i++;
        }
        return result;
    }
}
