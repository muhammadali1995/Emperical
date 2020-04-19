package InterviewPrep.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashMap<String, ArrayList<Integer>> uniqueArrayOfSums = new HashMap<>();
        List<List<Integer>> listOfSums = new ArrayList<>();
        Arrays.sort(nums);
        int outerI = 0;
        int outerJ = nums.length - 1;
        int innerI = 1;
        int innerJ = nums.length - 2;
        while (outerJ - 3 >= outerI) {
            while (innerJ - innerI >= 1) {
                int sum = nums[outerI] + nums[outerJ] + nums[innerI] + nums[innerJ];
                if ( sum <target){
                    innerI++;
                } else if (sum > target) {
                    innerJ--;
                } else {
                    String key = nums[outerI] + " " + nums[innerI] + " " + nums[innerJ] + " " + nums[outerJ];
                    if (!uniqueArrayOfSums.containsKey(key)) {
                        ArrayList<Integer> list = new ArrayList(4);
                        list.add(nums[outerI]);
                        list.add(nums[innerI]);
                        list.add(nums[innerJ]);
                        list.add(nums[outerJ]);
                        uniqueArrayOfSums.put(key, list);
                        listOfSums.add(list);
                        System.out.println(key);
                        innerJ--;
                    }
                }
            }

            if (nums[outerI] + nums[outerJ] + nums[innerI] + nums[innerI] < target) {
                outerI++;
                innerI++;
            } else if (nums[outerI] + nums[outerJ] + nums[innerI] + nums[innerI] > target) {
                outerJ--;
                innerI--;
            }else {
                outerI++;
                innerI++;
            }
        }
        return listOfSums;
    }
}
