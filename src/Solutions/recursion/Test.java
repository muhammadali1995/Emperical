package Solutions.recursion;

import Solutions.ReverseBits;

public class Test {
    public static void main(String[] args) {
        ListNode node = new ListNode(4);
        node.next = new ListNode(5);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(7);
        node.next.next.next.next = new ListNode(8);

        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.reverseLists(node);
    }
    private static void printReverse(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}
