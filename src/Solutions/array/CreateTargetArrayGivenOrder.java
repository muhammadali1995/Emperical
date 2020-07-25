package Solutions.array;

import java.util.Iterator;
import java.util.LinkedList;

public class CreateTargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int start = 0;
        Iterator i = list.iterator();
        while (i.hasNext()) {
            target[start++] = (int) i.next();
        }

        return target;
    }
}
