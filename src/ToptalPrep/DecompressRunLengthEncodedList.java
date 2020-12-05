package ToptalPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {

        DecompressRunLengthEncodedList lengthEncodedList = new DecompressRunLengthEncodedList();

        System.out.println(Arrays.toString(lengthEncodedList.decompressRLElist(new int[]{1, 2, 3, 4})));
    }

    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressedArr = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {
            while (nums[i] > 0) {
                nums[i]--;
                decompressedArr.add(nums[i + 1]);
            }
        }
        int[] result = new int[decompressedArr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = decompressedArr.get(i);
        }
        return result;
    }
}
