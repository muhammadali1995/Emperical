package Solutions;

import java.util.ArrayList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double numberOne = 0;
        double numberTwo = 0;
        double i = 0;

        while (l1 != null) {
            numberOne += l1.val * Math.pow(10, i);
            l1 = l1.next;
            i++;
        }

        i = 0;
        while (l2 != null) {
            numberTwo += l2.val * Math.pow(10, i);
            l2 = l2.next;
            i++;
        }
        int val = (int) (numberOne + numberTwo);

        return  new ListNode(val);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
