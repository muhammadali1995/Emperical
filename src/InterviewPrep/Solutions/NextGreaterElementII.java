package InterviewPrep.Solutions;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        int nthElement = 0;
        int j = 0;
        while (nthElement < nums.length) {
            int i = nthElement;
            int count = 0;
            while (count <= nums.length) {
                if (i==nums.length) i = 0;
                if (count==nums.length) {
                    arr[j] = -1 ;
                    j++;
                    break;
                } else if (nums[nthElement] < nums[i]){
                    arr[j] = nums[i];
                    j++;
                    break;
                }
                i++;
                count++;
            }
            nthElement++;
        }
        return arr;
    }
}
