package InterviewPrep.DataStucture.Queue;

import Solutions.ListNode;

//implentation with linkedlist
class TailLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public TailLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void push(int val) {
        if (head == null) {
            ListNode node = new ListNode(val);
            head = node;
            tail = node;
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        size++;
    }

    public int popFront() {
        int val = 0;
        if (head != null) {
            val = head.val;
            head = head.next;
            if (size == 1) {
                tail = tail.next;
            }
            size--;
        }
        return val;
    }

    public boolean empty() {
        return size == 0;
    }
}

public class MyQueue {
    private TailLinkedList linkedList;

    public MyQueue() {
        linkedList = new TailLinkedList();
    }
    public void enqueue(int val){
        linkedList.push(val);
    }

    public int dequeue(){
        return linkedList.popFront();
    }

    public boolean empty(){
        return linkedList.empty();
    }
}
