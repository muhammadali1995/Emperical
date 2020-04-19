package InterviewPrep.Solutions;

import Solutions.ListNode;

public class PartitionList {

    public ListNode partition1(ListNode head, int x) {
            if (head==null) return null;

            ListNode helperNode = head;
            ListNode leftNode = null;
            ListNode leftHelperNode = null;
            ListNode rightNode = null;
            ListNode rightNodeHelper = null;
            while (helperNode != null) {
                if (x <= helperNode.val) {
                    if (rightNode == null) {
                        rightNode = new ListNode(helperNode.val);
                        rightNodeHelper = rightNode;
                    } else {
                        rightNodeHelper.next = new ListNode(helperNode.val);
                        rightNodeHelper = rightNodeHelper.next;
                    }
                } else {
                    if (leftNode == null) {
                        leftNode = new ListNode(helperNode.val);
                        head = leftNode;
                        leftHelperNode = leftNode;
                    } else {
                        leftHelperNode.next = new ListNode(helperNode.val);
                        leftHelperNode = leftHelperNode.next;
                    }
                }
                helperNode = helperNode.next;
            }
            if(leftHelperNode!=null) leftHelperNode.next = rightNode;
            else head = rightNode;
            return head;
        }
    }
