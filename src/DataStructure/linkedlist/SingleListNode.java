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
    * */
    public SingleListNode(Object item, SingleListNode next) {
        this.item = item;
        this.next = next;
    }
}
