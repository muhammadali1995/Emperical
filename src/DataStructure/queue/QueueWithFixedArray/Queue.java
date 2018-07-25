package DataStructure.queue.QueueWithFixedArray;

/**
 * Created by User on 6/3/2018.
 */
public class Queue {

    /**
     * array to hold the elements of the queue
     */
    private QueueArray elements;

    public Queue() {
        elements = new QueueArray(10);
    }

    /**
     * adds item at end of queue
     */
    public void enqueue(Object item) {
        elements.insert(item);
    }

    /**
     * returns value and removes least recently added element
     */
    public Object dequeue() {
        return elements.remove();
    }

    public boolean empty(){
        return true;
    }





}
