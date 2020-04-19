package InterviewPrep.DataStucture.Queue;

public class MyCircularQueue {
    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    private int size = 0;
    private int [] storage;
    private int start = 0;
    private int end = 0;

    public MyCircularQueue(int k) {
        storage = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (size == storage.length) return false;
        if (end < storage.length) {
            storage[end] = value;
            size++;
            end++;
            return true;
        } else if (start != 0) {
            end = 0;
            storage[end] = value;
            size++;
            end++;
            return true;
        }
        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (size > 0) {
            if (start == storage.length-1) {
                start = 0;
            } else {
                start++;
            }
            size--;
            return true;
        }
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (size==0) return -1;
        return storage[start];
    }

    /** Get the last item from the queue. */
       public int Rear() {
        if (size==0) return -1;
        return storage[end - 1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == storage.length;
    }
}