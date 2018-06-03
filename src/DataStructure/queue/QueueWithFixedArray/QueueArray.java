package DataStructure.queue.QueueWithFixedArray;

/**
 * Created by User on 6/3/2018.
 */
public class QueueArray {

    int headIndex = 0;
    int tailIndex = 0;


    /**
     * elements array holding all the elements of the queue
     */
    private Object[] elements;


    /**
     * default size of the elements array is 16
     */
    public QueueArray() {
        elements = new Object[16];
    }

    /**
     * constructor to initialize the elements array with custom size
     */
    public QueueArray(int size) {
        elements = new Object[size];
    }

    /**
     * add item at the end of available storage
     */

    public void insert(Object item) {
        int size = elements.length;
        int tQuotient = tailIndex / size;
        int tRemainder = tailIndex % size;
        int hQuotient = headIndex / size;
        int hRemainder = headIndex % size;

        if (tQuotient < 1) {
            elements[tRemainder] = item;
            tailIndex++;
        } else if (hQuotient < 1 && ((hRemainder - tRemainder) > 1)) {
            elements[tRemainder] = item;
            tailIndex++;
        } else if (tRemainder - hRemainder == 1 || (tRemainder - hRemainder) == -1) {
            try {
                throw new Exception("the queue is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            elements[tRemainder] = item;
            tailIndex++;
        }
    }


    public Object remove() {

        int size = elements.length;
        int tQuotient = tailIndex / size;
        int tRemainder = tailIndex % size;
        int hQuotient = headIndex / size;
        int hRemainder = headIndex % size;

        if (hQuotient < 1) {
            if (tailIndex == 0) {
                try {
                    throw new Exception("the queue is empty");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            headIndex++;
            return elements[hRemainder];
        } else if (tQuotient >= hQuotient && ((hRemainder - tRemainder) == 1 || (hRemainder - tRemainder) == -1 || (hRemainder - tRemainder) == 0)) {
            try {
                throw new Exception("The array is empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            headIndex++;
            return elements[hRemainder];
        }
        return null;
    }

}
