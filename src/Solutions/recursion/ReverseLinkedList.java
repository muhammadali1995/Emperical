package Solutions.recursion;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x;}
}
public class ReverseLinkedList {
    ListNode node;
    ListNode lastNode;
    public ListNode reverseListRecursively(ListNode head){
        if (head==null) return head;
        reverse(head);
        return lastNode;
    }
    public ListNode reverseLists(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseLists(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public ListNode reverse(ListNode head) {
        if (head==null) return head;
        reverse(head.next);
        if (node == null) {
            node = new ListNode(head.val);
            lastNode = node;
        } else  {
            node.next = new ListNode(head.val);
            node = node.next;
        }
        return node;
    }

    public ListNode reverseList(ListNode head) {

        ListNode node = new ListNode(head.val);
        while (head.next != null) {
            ListNode temp = node;
            node = new ListNode(head.next.val);
            node.next = temp;
            head = head.next;
        }
        return node;
    }

}
