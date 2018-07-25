package DataStructure.linkedlist;

import DataStructure.queue.QueueLinkedList;

public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        SingleLinkedList linkedList = new SingleLinkedList();

        /**
         * Testing  size ()
         * */
        assert linkedList.size() == 0 : "size must be 0";
        linkedList.pushFront(1);
        assert linkedList.size == 1 : "size must be equal to 1";
        linkedList.removeValue(1);

        /**
         * Testing empty ()
         * */
        assert linkedList.empty() : "the value returned should be true";

        /**
         * Testing valueAt(int index)
         * */
        linkedList.pushFront(2);
        linkedList.insert(2, 22);
        assert linkedList.valueAt(2) == (Integer) 22 : "the value must be equal to 22";

        /**
         * Testing pushFront()
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
         * Testing pushBack(Object item)
         * */
        linkedList.pushBack(12);
        assert linkedList.popBack() == (Integer) 12 : "the value at back should be equal to 12";
        linkedList.pushBack(13);
        linkedList.pushBack(78);
        assert linkedList.popBack() == (Integer) 78 : "the value at the back should be 78";


        /**
         * Testing front()
         * */

        linkedList.pushFront(34);
        assert linkedList.front() == (Integer) 34 : "the value returned should be equal to 34";

        /**
         * Testing back()
         * */

        linkedList.pushBack(89);
        assert linkedList.back() == (Integer) 89 : "the value returned should be equal to 89";


        /**
         * Testing insert(int index, Object item)
         * */

        SingleLinkedList list = new SingleLinkedList();
        list.insert(1, 34);

        /*Case when the list is empty*/
        assert list.valueAt(1) == (Integer) 34 : "the value at position 1 should be 34";

        /*Case when the size of the list equals to 1*/
        list.insert(2, 45);
        assert list.valueAt(2) == (Integer) 45 : "the value at position 2 should be equal to 45";

        /*Case when value is inserted between two elements*/
        list.insert(2, 90);
        assert list.valueAt(2) == (Integer) 90 : "the value at position 2 should be equal to 90";

        list.pushFront(32);
        /*Listing all the elements of the list*/
        /**
         * Testing erase(int index)
         * */

        list.erase(2);
        assert list.valueAt(2) == (Integer) 90 : "the value at index 2 should be equal to 90";
        list.erase(2);
        assert list.valueAt(2) == (Integer) 45 : "the value at index 2 should be equal to 45";
        list.erase(2);
        list.erase(1);

        assert list.size() == 0 : "the size of the list should be equal to 0";

        /**
         * Testing value_n_from_end(int n)
         * */
        list.insert(1, 2);
        assert list.getValueOfNFromEnd(1) == (Integer) 2 : "the value should be equal to 2";
        list.pushFront(3);
        list.pushBack(989);
        assert list.getValueOfNFromEnd(2) == (Integer) 2 : "the value should be equal to 2";

        /**
         * Testing reverse()
         * */
        System.out.println("before reverse");
        for (int i = 1; i <= list.size; i++) {
            System.out.println(list.valueAt(i));
        }

        list.reverse();
        System.out.println("after reverse");

        for (int i = 1; i <= list.size; i++) {
            System.out.println(list.valueAt(i));
        }

        /**
         * Testing  remove_value()
         * */

        assert list.valueAt(2) == (Integer) 2 : "the value at position 2 should be 2";
        list.removeValue(2);
        assert list.valueAt(2) == (Integer) 3 : "the value at position 2 should be 3";

    }
}
