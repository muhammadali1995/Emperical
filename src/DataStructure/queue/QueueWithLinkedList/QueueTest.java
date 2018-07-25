package DataStructure.queue.QueueWithLinkedList;

/**
 * Created by User on 5/27/2018.
 */
public class QueueTest {
    public static void main(String[] args) {

        /**
         * Testing enqueue()
         * */

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(45);
        queue.enqueue(23);

        assert queue.dequeue() == (Integer) 1 : "the value dequeued should be 1";
        assert queue.dequeue() == (Integer) 45 : "the value dequeued should be 45";

        assert !queue.empty() : "queue is not empty";

        Queue queue1 = new Queue();
        assert queue1.empty() : "queue is empty";



    }
}
