package InterviewPrep.Solutions;

import Solutions.ListNode;

import java.util.Stack;

public class ReOrderList {
    public void reorderList(ListNode head) {
        ListNode helperNode2= head;
        Stack<Integer> evenValues = new Stack<>();
        ListNode helperNode = head;
        while (helperNode != null) {
            evenValues.push(helperNode.val);
            helperNode = helperNode.next;
        }

        int index = 0;
        while (helperNode2 !=null) {
            helperNode2 = helperNode2.next;
        }
    }
}
