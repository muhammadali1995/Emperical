package InterviewPrep.Solutions;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k != 0 || k % nums.length != 0) {
            int nOfTimesToRotate = nums.length - k % nums.length;
            for (int i = 0; i < nOfTimesToRotate; i++) {
            }
        }
    }
}
