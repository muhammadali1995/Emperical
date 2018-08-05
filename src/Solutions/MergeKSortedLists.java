package Solutions;

/**
 * Created by User on 8/5/2018.
 */
public class MergeKSortedLists {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 3};
        int[] arr2 = new int[]{5, 6, 4};
        ListNode l1 = new ListNode(arr1[0]);
        ListNode l2 = new ListNode(arr2[0]);
        ListNode tmp = l1;
        ListNode tmp2 = l2;

        for (int i = 1; i < arr1.length; i++) {
            tmp.next = new ListNode(arr1[i]);
            tmp = tmp.next;
        }

        for (int i = 1; i < arr2.length; i++) {
            tmp2.next = new ListNode(arr2[i]);
            tmp2 = tmp2.next;
        }
        mergeKLists(new ListNode[]{l1, l2});


    }


    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode mergedList = lists[0];

        int i = 1;
        while (lists.length > i) {

        }


        return null;
    }
}
