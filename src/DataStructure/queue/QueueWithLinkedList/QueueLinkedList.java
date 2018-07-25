package DataStructure.queue.QueueWithLinkedList;

import DataStructure.linkedlist.SingleListNode;

/**
 * Created by User on 5/23/2018.
 */
public class QueueLinkedList {
    private SingleListNode head;
    private SingleListNode tail;
    private int size;

    public QueueLinkedList() {
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

    /**
     * removes the first item in the beginning of the list and returns its value
     */
    public Object popFront() {
        if (this.tail == null) {
            return null;
        } else {
            SingleListNode tmpNode = this.head;

            if (this.head.next == null) {
                this.tail = null;
            }

            this.head = this.head.next;
            size--;
            return tmpNode.item;
        }
    }




}
