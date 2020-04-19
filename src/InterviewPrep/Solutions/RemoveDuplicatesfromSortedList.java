package InterviewPrep.Solutions;

import Solutions.ListNode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
         while(node!=null && node.next!=null) {
             if (node.val == node.next.val){
                 node.next = node.next.next;
             }else {
                 node = node.next;
             }
         }
        return head;
    }
}
