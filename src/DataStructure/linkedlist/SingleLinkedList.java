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

}
