package Solutions.linkedList;

import Solutions.ListNode;

import java.util.List;

public class IntersectionOfTwoLinkedLists {
    ListNode intersectionNode = null;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        traverse(headA, headB);
        return  intersectionNode;
    }


    public void traverse(ListNode nodeA, ListNode nodeB){
        if (nodeA.next==null || nodeB.next==null) return;
        traverse(nodeA.next, nodeB.next);
        System.out.println(nodeA.val + " " + nodeA.next.val);
        if (nodeA.val!=nodeB.val && nodeA.next.val==nodeB.next.val) intersectionNode = nodeA;
    }
}
