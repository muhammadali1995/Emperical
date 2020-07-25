package Solutions.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedArray {
    public static void main(String[] args) {
        FindAllNumbersDisappearedArray disappearedArray = new FindAllNumbersDisappearedArray();
        disappearedArray.findDisappearedNumbers(new int[]{2,3,4,5,6,7,8,1});
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp =  nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i <nums.length ; i++) {
             if (nums[i]!=i+1) list.add(i+1);
        }
        return list;
    }
}
