package DataStructure.queue;

/**
 * Queue implemented with LinkedList
 */
public class Queue {

    /**
     * LinkedList to implement queue
     */
    QueueLinkedList list = null;

    public Queue() {
        list = new QueueLinkedList();
    }

    /**
     * adds item at position at tail
     */
    public void enqueue(Object item) {
        list.pushBack(item);
    }

    /**
     * returns true if the queue is empty otherwise false
     */
    public boolean empty() {
        return list.empty();
    }

    /*
     * returns value and removes least recently added element
     * */

//    public Object dequeue(){
//      return list.front();
//    }

}
