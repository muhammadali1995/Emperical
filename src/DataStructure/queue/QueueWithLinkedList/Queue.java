package DataStructure.queue.QueueWithLinkedList;

/**
 *
 *
 * */
public class Queue {

    /**
     * Queue implemented with LinkedList
     */

    private QueueLinkedList list;

    public Queue() {
        list = new QueueLinkedList();
    }

    /**
     * adds value at position at tail
     */
    public void enqueue(Object item) {
        list.pushBack(item);
    }

    public Object dequeue() {
        return list.popFront();
    }

    public boolean empty() {
        return list.empty();
    }


}
