package DataStructure.queue;

import sun.awt.image.ImageWatched;

/**
 * Created by User on 5/27/2018.
 */
public class QueueTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(2);
        list.pushBack(2);
        list.pushBack(2);
        list.pushBack(12);
        System.out.println(list.valueAt(6));
    }
}
