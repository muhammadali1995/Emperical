package Solutions.linkedList;

import Solutions.ListNode;

import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        int size = 0, i, temp;
        ListNode helperNode = head;
        while (helperNode != null) {
            size++;
            helperNode = helperNode.next;
        }
        while (size > 0) {
            i = 0;
            helperNode = head;
            while (i < size - 1) {
                if (helperNode.val > helperNode.next.val) {
                    temp = helperNode.val;
                    helperNode.val = helperNode.next.val;
                    helperNode.next.val = temp;
                }
                i++;
                helperNode = helperNode.next;
            }
            size--;
        }
        return head;
    }

}
