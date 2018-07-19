package DataStructure.linkedlist;

import DataStructure.queue.QueueWithLinkedList.QueueLinkedList;

public class LinedListTest {
    public static void main(String[] args) throws Exception {
        SingleLinkedList linkedList = new SingleLinkedList();
        /**
         * testing  size () function
         * */
        assert linkedList.size() == 0 : "size must be 0";
        linkedList.pushFront(1);
        assert linkedList.size == 1 : "size must be equal to 1";
        linkedList.removeValue(1);

        /**
         * testing empty function
         * */
        assert linkedList.empty() : "the value returned should be true";

        /**
         * testing valueAt() function
         * */
        linkedList.pushFront(2);
        linkedList.insert(2, 22);
        assert linkedList.valueAt(2) == (Integer) 22 : "the value must be equal to 22";

        /**
         * testing pushFront()
         * */

        linkedList.pushFront(2);
        linkedList.pushFront(3);
        assert linkedList.valueAt(1) == (Integer) 3 : "the value at front should be equal to 3";
        QueueLinkedList linkedListTwo = new QueueLinkedList();
        linkedList.pushFront(1);
        assert linkedList.popFront() == (Integer) 1 : "the value at front should be equal to 1";

        /**
         * Testing popFront()
         * */
        linkedList.pushFront(23);
        linkedList.pushFront(45);
        assert linkedList.popFront() == (Integer) 45 : "the value returned by popFront should be equal to 45";

        /**
         * Testing pushBack()
         * */
        linkedList.pushBack(12);
        assert linkedList.popBack() == (Integer) 12 : "the value at back should be equal to 12";
        linkedList.pushBack(13);
        linkedList.pushBack(78);
        assert linkedList.popBack() == (Integer) 78 : "the value at the back should be 78";

        linkedList.pushFront(25);
        linkedList.popBack();
        linkedList.insert(2, 99);
        linkedList.insert(5, 1);
        linkedList.insert(6, 2);

        linkedList.removeValue(1);
        linkedList.pushFront(1);
        linkedList.removeValue(1);
        System.out.println(linkedList.size);
        linkedList.insert(1, 12);
        linkedList.removeValue(1);
        //remove
        for (int i = 1; i <= linkedList.size; i++) {
            System.out.println(linkedList.valueAt(i));
        }

        // reverse the list


    }
}
