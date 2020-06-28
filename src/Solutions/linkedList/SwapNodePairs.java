package Solutions.linkedList;

import Solutions.ListNode;

import java.util.List;

public class SwapNodePairs {
    public ListNode swapPairs(ListNode head) {
        return swap(head);
    }


    public ListNode swap(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;
        return head;
    }

}
