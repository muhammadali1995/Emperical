package ToptalPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStone {
    public static void main(String[] args) {
        LastStone lastStone = new LastStone();
        System.out.println(lastStone.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        Arrays.sort(stones);
        for (int i: stones) {
            queue.offer(i);
        };

        while (queue.size()>1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a != b) {
                queue.add(Math.abs(a-b));
            }
        }

        if (!queue.isEmpty()) return queue.poll();

        return  0;
    }
}
