package Solutions.recursion;

import Solutions.ListNode;
import Solutions.ReverseBits;
import Solutions.linkedList.PalindromeLinkedList;

public class Test {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(6);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(7);

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        palindromeLinkedList.isPalindrome(node);

        TreeNode node1 = new TreeNode(5);
        node1.left = new TreeNode(7);
        node1.right = new TreeNode(6);
        node1.left.left = new TreeNode(8);
        node1.left.right = new TreeNode(9);

//        linkedList.reverseLists(node);
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
