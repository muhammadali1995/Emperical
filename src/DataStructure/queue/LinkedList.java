package DataStructure.queue;

import DataStructure.linkedlist.SingleListNode;

/**
 * Created by User on 5/23/2018.
 */
public class LinkedList {
    private SingleListNode head;
    private SingleListNode tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        if (this.size > 0) {
            return false;
        }
        return true;
    }

    public Object valueAt(int position) {
        return head.nth(position).item;
    }

    public void pushFront(Object item) {
        this.head = new SingleListNode(item, this.head);
        size++;
    }


    /**
     * add the item to the end of the list
     */

    public void pushBack(Object item) {
        if (this.tail == null) {
            SingleListNode node = new SingleListNode(item, null);
            this.head = node;
            this.tail = node;
            size++;
        } else {
            this.tail.next = new SingleListNode(item, null);
            this.tail = this.tail.next;
            size++;
        }
    }



}
