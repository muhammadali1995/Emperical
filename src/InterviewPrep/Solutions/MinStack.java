package InterviewPrep.Solutions;

import Solutions.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    private ArrayList<Integer> stack;
    private int minVal = 0;

    public MinStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size()==0){
            minVal = x;
        }else if (minVal>x){
            minVal = x;
        }
        this.stack.add(x);
    }

    public void pop() {
        int lastDeleted = top();
        this.stack.remove(this.stack.size() - 1);
        if (stack.size()>0 && getMin() == lastDeleted) {
            minVal = stack.get(0);
            for (int i = 0; i < stack.size(); i++) {
                if (minVal > stack.get(i)) {
                    minVal = stack.get(i);
                }
            }
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return minVal;
    }
}
