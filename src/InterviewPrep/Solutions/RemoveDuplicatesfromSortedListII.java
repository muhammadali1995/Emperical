package InterviewPrep.Solutions;

import Solutions.ListNode;

import java.util.HashMap;
import java.util.List;

public class RemoveDuplicatesfromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next==null) return head;
        ListNode node = head;

        int lastValue = head.value;

        while (node.next != null) {
            if (lastValue == node.next.val) {
                lastValue = node.next.val;
                node.next = node.next.next;
            } else if (node.next.next != null && node.next.val == node.next.next.val) {
                lastValue = node.val;
                node.next = node.next.next;
            } else {
                lastValue = node.val;
                node = node.next;
            }
         }

        return head;

    }


    public ListNode deleteDuplicates1(ListNode head) {
        HashMap<Integer, Integer> duplicates = new HashMap<>();
        ListNode node = head;
        while (node != null) {
            int value = 0;
            if (duplicates.get(node.val) != null) {
                value = duplicates.get(node.val);
            }
            ++value;
            duplicates.put(node.val, value);
            node = node.next;
        }
        ListNode helperNode = head;

        while (helperNode!=null && helperNode.next!=null) {
            if (duplicates.get(helperNode.next.val)>1){
                helperNode.next = helperNode.next.next;
            }else {
                helperNode = helperNode.next;
            }
        }


        if (head!=null && duplicates.get(head.val)>1){
            head = head.next;
        }

        return head;
    }
}
