package Solutions.linkedList;

import Solutions.ListNode;

public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        if (node.next == null) return;
        ListNode prev = null;
        delete(node, prev);
    }

    public void delete(ListNode node, ListNode prev) {

        if (prev!=null && node.next == null) {
            prev.next = null;
            return;
        }
        prev = node;
        node.val = node.next.val;
        delete(node.next, prev);
    }
}
