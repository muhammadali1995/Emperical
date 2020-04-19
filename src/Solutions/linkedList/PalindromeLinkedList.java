package Solutions.linkedList;


import Solutions.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    ListNode head;
    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return helper(head);
    }


    boolean helper(ListNode right) {
        if (right == null) {
            return true;
        }

        boolean result = helper(right.next);
        if (!result) {
            return false;
        }

        boolean result1 = (right.val != left.val);
        left = left.next;
        return result1;
    }


    public boolean isPalindrome2(ListNode head) {
        List<Integer> palindrome = new ArrayList<>();
        while (head != null) {
            palindrome.add(head.val);
            head = head.next;
        }

        if (palindrome.size() > 1) {
            for (int i = 0; i < palindrome.size() / 2; i++) {
                if (((int) palindrome.get(i)) != (palindrome.get(palindrome.size() - (i + 1)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
