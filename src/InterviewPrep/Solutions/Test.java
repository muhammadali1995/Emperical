package InterviewPrep.Solutions;

import InterviewPrep.DataStucture.Heap.Heap;
import Solutions.ListNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int [] arr = new int[] {11,49,100,20,86,29,72};
        ListNode node = new ListNode(1);
        node.next = new ListNode(0);
        node.next.next = new ListNode(1);
        MaxDifferenceYouCanGetFromChangingInteger searchInARotatedArray = new MaxDifferenceYouCanGetFromChangingInteger();

        System.out.println(searchInARotatedArray.maxDiff(1101057));
    }


    public static ListNode constructList(ListNode head, int[] values) {
        ListNode node = head;
        for (int i = 1; i < values.length; i++) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        return head;
    }
}
