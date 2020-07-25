package Solutions.array;

public class FindNumbersEvenNumberDigits {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int sLength = Integer.toString(nums[i]).length();
            if (sLength % 2 == 0) result++;
        }
        return result;
    }
}
