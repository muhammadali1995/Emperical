package InterviewPrep.Solutions;

import Solutions.ListNode;

import java.util.HashMap;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> nodes = new HashMap<>();
        ListNode helperNode = head;
        while(helperNode!=null){
            if (nodes.get(helperNode)!=null){
                return helperNode;
            } else {
                nodes.put(helperNode, 1);
            }
            helperNode = helperNode.next;
        }
        return null;
    }
}
