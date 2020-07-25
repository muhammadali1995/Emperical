package Solutions.array;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int countOfChangesToBeDone = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                countOfChangesToBeDone++;
                nums[i + 1]  = nums[i];
            }
        }

        return countOfChangesToBeDone <= 1;
    }
}
