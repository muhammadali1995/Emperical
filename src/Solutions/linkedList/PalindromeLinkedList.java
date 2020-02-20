package Solutions.linkedList;


import Solutions.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    ListNode comp;
    boolean isPal = true;


    public boolean isPalindrome1(ListNode head) {
        comp = head;
        return helper(head);
    }


    boolean helper(ListNode head){
        if (head == null) {
            return isPal;
        }
        helper(head.next);
        if (head.val!=comp.val){
            return false;
        }
        comp = comp.next;
        return isPal;
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
