package Solutions.array;

import java.util.ArrayList;

public class DecompressRunEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        int[] result = new int[length];
        int start = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int j = 0;
            while (j++ < nums[i]) {
                result[start++] = nums[i + 1];
            }
        }
        return result;
    }
}
