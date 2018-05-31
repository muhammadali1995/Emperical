package DataStructure.linkedlist;

public class SingleLinkedList {
    /**
     * head holds the head of the Single List
     */
    public SingleListNode head;
    /**
     * size is the number of Single List Nodes in the List
     */
    public int size;

    /**
     * the following constructor initializes an empty Single Linked List
     */
    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * returns the number of item in the list
     */
    public int size() {
        return size;
    }


    /**
     * return true if the list is empty else false
     */

    public boolean empty() {
        if (this.size > 0) {
            return false;
        }
        return true;
    }

    /**
     * returns the node in the  given position. The method uses nth() method of SingleListNode
     */

    public Object valueAt(int position) {
        return head.nth(position).item;
    }


    /**
     * add an item to the beginning of the list, increments the size of the list and returns void
     */
    public void pushFront(Object item) {
        this.head = new SingleListNode(item, this.head);
        size++;
    }

    /**
     * removes the first node in the list and returns the removed node
     */

    public Object popFront() {
        if (head != null) {
            SingleListNode tmp = head;
            head = head.next;
            size--;
            return tmp.item;
        }
        return null;
    }

    /**
     * add new node to the end of the list and increments the size
     */
    public void pushBack(Object item) {
        if (head.nth(size).next == null) {
            head.nth(size).next = new SingleListNode(item, null);
            size++;
            return;
        }
    }


    /**
     * removes the item in the end of the list and returns its value
     */
    public Object popBack() {
        SingleListNode node = head.nth(size);
        head.nth(size - 1).next = null;
        size--;
        return node.item;
    }

    /**
     * return the first element in the list
     */
    public Object front() {
        return head.item;
    }

    /**
     * returns the last element in the list
     */
    public Object back() {
        return head.nth(size).item;
    }

    /**
     * insert an item at the given position and the item in the given position is pointed to
     */
    public void insert(int index, Object value) throws Exception {
        if (index <= size + 1 || index < 1) {
            SingleListNode node = head.nth(index - 1);
            if (node == null) {
                this.head = new SingleListNode(value, this.head);
                size++;
            } else {
                node.next = new SingleListNode(value, node.next);
                size++;
            }
        } else {
            throw new Exception("Index can be only 1 more than the size of the list");
        }
    }

    /**
     * removes the item in the given position as an argument
     */
    public void erase(int position) {
        SingleListNode node = head.nth(position - 1);
        node.next = node.next.next;
        size--;
    }

    /**
     * returns the value of the node at the nth from the end of the list
     */
    public Object getValueOfNFromEnd(int position) {
        if (position > size || position < 1) {
            return null;
        } else {
            position = size - (position - 1);
            return head.nth(position).item;
        }
    }

    /**
     * the reverses the list
     */

    public void reverse() {
        for (int i = 2; i <= size; i++) {
            swap(head.nth(i-1), head.nth(i));
        }

    }

    public void swap(SingleListNode nodeOne, SingleListNode nodeTwo) {
        System.out.println("Node 1 " + nodeOne.item);
        System.out.println("Node 2 " + nodeTwo.item);
        nodeTwo.next = nodeOne;

    }

    /**
     * removes the first node with the given value in the list
     */

    public void removeValue(Object value) {
        for (int i = 1; i <= size; i++) {
            if (this.valueAt(i) == value) {
                if (i == 1) {
                    this.head = this.head.nth(i + 1);
                    size--;
                    return;
                }
                SingleListNode node = this.head.nth(i - 1);
                if (i + 1 <= size) {
                    node.next = this.head.nth(i + 1);
                    size--;
                } else {
                    node.next = null;
                    size--;
                }
                return;
            }
        }
    }

}
