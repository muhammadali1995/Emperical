package DataStructure.queue.QueueWithFixedArray;

/**
 * Created by User on 6/3/2018.
 */
public class QueueArrayTest {

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.enqueue(12);
        queue.enqueue(23);
        queue.enqueue(89);
        queue.enqueue(1254);
        queue.dequeue();
        assert queue.dequeue() == (Integer) 23 : "the value dequeued should be 23";
        assert queue.dequeue() == (Integer) 89 : "the value dequeued should be 89";
        queue.enqueue(363);
//        queue.enqueue(3652);
//        queue.enqueue(364);
//        queue.enqueue(3645);
//        queue.enqueue(3634533);
//        queue.enqueue(3678);
//        queue.dequeue();
//        queue.enqueue(36123);
//        queue.enqueue(234);
//        queue.enqueue(784);
//
//        Queue queue1 = new Queue();
//        queue1.enqueue(2);
//
//
    }

}
