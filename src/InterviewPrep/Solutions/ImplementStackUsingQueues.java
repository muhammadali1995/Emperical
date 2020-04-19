package InterviewPrep.Solutions;

import java.util.LinkedList;

public class ImplementStackUsingQueues {
    /**
     * Initialize your data structure here.
     */
    LinkedList<Integer> queue;
    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.push(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = queue.size();
        int value = 0;
        while (size>0){
            value = queue.getFirst();
            queue.removeFirst();
            if (size>=1) queue.push(value);
            size--;
        }
        return value;
    }

    /** Get the top element. */
    public int top() {
        int size = queue.size();
        int value = 0;
        while (size>=0){
            value = queue.getFirst();
            queue.removeFirst();
            queue.push(value);
            size--;
        }
        return value;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.size() == 0;
    }
}
