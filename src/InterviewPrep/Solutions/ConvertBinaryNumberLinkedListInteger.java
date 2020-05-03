package InterviewPrep.Solutions;

import Solutions.ListNode;

import java.util.List;
import java.util.Stack;

public class ConvertBinaryNumberLinkedListInteger {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = (ans << 1);
            ans = ans|head.val;
            head = head.next;
        }
        return ans;
    }
    public int getDecimalValue2(ListNode head) {


        Stack<Integer> stackOfBits = new Stack<>();
        while (head != null) {
            stackOfBits.push(head.val);
            head = head.next;
        }

        int sum = 0;
        int count = 0;
        while (!stackOfBits.isEmpty()) {
            if (stackOfBits.peek() == 1) {
                sum += Math.pow(2, count);
            }
            stackOfBits.pop();
            count++;
        }
        return sum;
    }

    int a = 0;
    int sum = 0;
    private int calculate(ListNode head) {
        if (head.next==null) {
            return head.val;
        }
        int val = calculate(head.next);
        if (val == 1) {
            sum += Math.pow(2, a);
        }
        a++;
        return val;
    }
}
