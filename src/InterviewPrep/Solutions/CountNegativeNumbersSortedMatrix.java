package InterviewPrep.Solutions;

public class CountNegativeNumbersSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int index = findIndexOfFirstNegativeNum(grid[i]);
            if (index>-1) {
                count += grid[i].length - index;
            }
        }
        return count;
    }

    private int findIndexOfFirstNegativeNum(int[] nums) {
        int min = 0;
        int max = nums.length - 1;
        int mid;
        while (min <= max) {
            mid = (max + min) / 2;
            if (nums[mid] >= 0) {
                min = mid + 1;
            } else if (mid > 0 && nums[mid] <= 0 && nums[mid - 1] < 0) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
