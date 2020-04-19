package InterviewPrep.DataStucture.Queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyAQueue myAQueue = new MyAQueue(8);
        myAQueue.enqueue(1);
        myAQueue.enqueue(2);
        myAQueue.enqueue(3);
        myAQueue.enqueue(4);
        myAQueue.enqueue(5);
        myAQueue.enqueue(6);
        myAQueue.enqueue(7);
        myAQueue.enqueue(8);
        myAQueue.enqueue(6);
        assert myAQueue.full() : "it should be full";
    }
}
