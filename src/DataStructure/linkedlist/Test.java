package DataStructure.linkedlist;

public class Test {
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
        linkedList.insert(1, 12);
        linkedList.insert(2, 22);
        assert linkedList.valueAt(2) == (Integer) 22 : "the value must be equal to 22";



        linkedList.pushFront(2);
        linkedList.pushFront(3);
        linkedList.popFront();
        linkedList.pushBack(12);
        linkedList.pushBack(13);
        linkedList.pushFront(25);
        linkedList.popBack();
        linkedList.insert(2, 99);
        linkedList.insert(5, 1);
        linkedList.insert(6, 2);

        for (int i = 1; i <= linkedList.size; i++) {
            System.out.println(linkedList.valueAt(i));
        }
        linkedList.removeValue(1);
        for (int i = 1; i <= linkedList.size; i++) {
            System.out.println(linkedList.valueAt(i));
        }
        SingleLinkedList linkedList2 = new SingleLinkedList();
        linkedList2.pushFront(1);
        linkedList2.removeValue(1);
        System.out.println(linkedList2.size);


    }
}
