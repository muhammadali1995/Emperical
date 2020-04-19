package InterviewPrep.Solutions;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int posToBeReplaced = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && posToBeReplaced == -1) {
                posToBeReplaced = i;
            } else if (nums[i]!=0 && posToBeReplaced != -1){
                nums[posToBeReplaced] = nums[i];
                posToBeReplaced++;
                nums[i] = 0;
            }
        }
    }
}
