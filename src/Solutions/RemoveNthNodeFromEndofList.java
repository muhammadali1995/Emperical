package Solutions;

/**
 * Created by User on 7/29/2018.
 */
public class RemoveNthNodeFromEndofList {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        ListNode l1 = new ListNode(arr1[0]);
        ListNode tmp = l1;
        for (int i = 1; i < arr1.length; i++) {
            tmp.next = new ListNode(arr1[i]);
            tmp = tmp.next;
        }
        removeNthFromEnd(l1, 1);

        while (l1.next != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
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
            if (size - n == 0) {
                nextTmp = nextTmp.next;
                head = nextTmp;
                return head;
            } else if (i == size - n) {
                nextTmp.next = nextTmp.next.next;
                return nextTmp;
            }
            i++;
            nextTmp = nextTmp.next;
        }

        return null;
    }


}

