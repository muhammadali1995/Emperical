package Solutions.linkedList;

import Solutions.ListNode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        traverse(headA, headB, listA, listB);
        int length = Math.min(listA.size(), listB.size());
        if (!listA.get(length - 1).equals(listB.get(length - 1))) return null;

        while (length>0){
            if (listA.get(length - 1).equals(listB.get(length - 1))) length--;
        }
        int val = listA.get(length);

        ListNode temp = headA;
        while (temp.next != null) {
            if (temp.val==val) return temp;
            temp = temp.next;
        }

        return headA;
    }


    public void traverse(ListNode nodeA, ListNode nodeB, ArrayList<Integer> listA, ArrayList<Integer> listB) {
        if (nodeA.next == null || nodeB.next == null) {
            return;
        }
        listA.add(nodeA.value);
        listB.add(nodeB.value);
        traverse(nodeA.next, nodeB.next, listA, listB);
    }
}
