package InterviewPrep.Solutions;

import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, int[]> container = new HashMap<>();
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeroCount++;
            if (nums[i] == 1) oneCount++;
            container.put(i, new int[]{oneCount, zeroCount});
        }
        if (zeroCount == oneCount) {
            return zeroCount * 2;
        } else if (zeroCount == 0 || oneCount == 0) {
            return 0;
        } else {
            int max = Math.max(zeroCount, oneCount);
            int[] arr = container.get(nums.length-max-1);
            return (arr[0] + arr[1]) * 2;
        }
    }
}
