package InterviewPrep.Solutions;

public class MinimumValueGetPositiveStepSum {
    public int minStartValue(int[] nums) {

        int i = 1;
        boolean myBool = true;
        while (myBool) {
            int sum = i;
            for (int j = 0; j <nums.length ; j++) {
                sum += nums[j];
                if (sum<1) break;
            }
            if (sum>=1){
                myBool = false;
                return i;}
            i++;
        }
        return i;
    }
}
