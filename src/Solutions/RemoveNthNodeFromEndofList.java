package Solutions;

import java.util.List;

/**
 * Created by User on 7/29/2018.
 */
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 3};
        ListNode l1 = new ListNode(arr1[0]);
        ListNode tmp = l1;
        for (int i = 1; i < arr1.length; i++) {
            tmp.next = new ListNode(arr1[i]);
            tmp = tmp.next;
        }

        System.out.println(removeNthFromEnd(l1, 3).val);


    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 1;

        ListNode tmp = head;
        while (tmp.next != null) {
            ++size;
            tmp = tmp.next;
        }

        int i = 1;
        ListNode nextTmp = head;
        while (nextTmp.next != null) {
            if (i == size - n) {
                nextTmp.next = nextTmp.next.next;
                if (i == 1) {
                    nextTmp = nextTmp.next;
                    head = nextTmp;
                }
                return head;
            }
            i++;
            nextTmp = nextTmp.next;
        }

        return null;
    }


}

