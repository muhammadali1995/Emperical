package ToptalPrep;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanCurrentNumber smallerThanCurrentNumber = new HowManyNumbersAreSmallerThanCurrentNumber();
        System.out.println(Arrays.toString(smallerThanCurrentNumber.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int[] sample = nums.clone();
        Arrays.sort(sample);
        int j = 0;
        for (int n : nums) {
            int countOfSmaller = 0;
            int i = 0;
            while (sample[i] < n) {
                countOfSmaller++;
                i++;
            }
            output[j++] = countOfSmaller;
        }

        return output;
    }
}
