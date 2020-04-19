package InterviewPrep.Solutions;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 1 || k == 0) return false;
        int fast = 1;
        int slow = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (fast - slow > k) {
                while (slow < fast - 1) {
                    slow++;
                    if (nums[fast] == nums[slow]) return true;
                }
            } else {
                if (nums[fast] == nums[slow]) return true;
                fast++;
            }
        }

        fast = nums.length - 1;

        while (slow < fast - 1) {
            slow++;
            if (nums[fast] == nums[slow]) return true;
        }
        return false;
    }


}
