package InterviewPrep.Solutions;

public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int fistIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[fistIndex]!=nums[i]){
                nums[++fistIndex] = nums[i];
            }
        }
        return fistIndex+1;
    }
}
