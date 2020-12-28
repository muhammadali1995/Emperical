package ToptalPrep;

import Solutions.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        reverseLinkedList.reverseList(node);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;


        ListNode prev = new ListNode(head.val);

        ListNode temp = head;
        temp = temp.next;

        head = head.next;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;

            // 1-> 2 ->

            if (nextNode != null) {
                head = nextNode;
            } else {
                head = null;
            }
        }

        return prev;
    }
}
