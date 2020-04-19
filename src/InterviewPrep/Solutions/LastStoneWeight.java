package InterviewPrep.Solutions;

import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int size = stones.length;
        if (size == 1) return stones[0];
        Arrays.sort(stones);

        for (int i = stones.length - 1; i > 0; i--) {
            if (( stones[i] - stones[i - 1]) > 0) {
                stones[i - 1] =  stones[i] - stones[i - 1];
                Arrays.sort(stones);
            } else {
                i--;
                size--;
            }
            size--;
        }

        return size > 0 ? stones[0] : 0;
    }
}
