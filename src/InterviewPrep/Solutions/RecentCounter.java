package InterviewPrep.Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queueOfTimers;
    public RecentCounter() {
        this.queueOfTimers = new LinkedList<>();
    }

    public int ping(int t) {
        int rangeStart = t - 3000;
        while (queueOfTimers.size() > 0 && queueOfTimers.peek() < rangeStart) {
            queueOfTimers.remove();
        }
        queueOfTimers.add(t);
        return queueOfTimers.size();
    }
}
