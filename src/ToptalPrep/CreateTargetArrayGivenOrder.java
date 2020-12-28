package ToptalPrep;

import java.util.LinkedList;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            linkedList.add(index[i], nums[i]);
        }

        int i = 0;
        while (!linkedList.isEmpty()){
           nums[i++] = linkedList.pollFirst();
        }

        return  nums;
    }
}
