package DataStructure.linkedlist;

public class SingleListNode {
    /**
     * the item to hold the value of the node
     */
    public Object item;

    /**
     * the next variable holds reference to the next Node
     */
    public SingleListNode next;

    /**
     * constructor to initialize a new node
     */
    public SingleListNode(Object item, SingleListNode next) {
        this.item = item;
        this.next = next;
    }


    public SingleListNode nth(int position) {
        if (position == 1) {
            return this;
        } else if ((position < 1) || (next == null)) {
            return null;
        } else {
            return next.nth(position - 1);
        }
    }





}
