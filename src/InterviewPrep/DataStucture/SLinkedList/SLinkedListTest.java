package InterviewPrep.DataStucture.SLinkedList;

public class SLinkedListTest {
    public static void main(String[] args) {
        SLinkedList sLinkedList = new SLinkedList();
        sLinkedList.pushBack(1);
        sLinkedList.pushBack(2);
        sLinkedList.pushBack(3);
        sLinkedList.pushBack(4);
        sLinkedList.pushBack(5);
        assert sLinkedList.size() == 5 : "Pushback is working incorrectly";
        assert !sLinkedList.empty() : "the list should not be empty";
        assert sLinkedList.valueAt(2) == 3 : "the value should be 3";
        int value = sLinkedList.popFront();
        assert value == 1 && sLinkedList.size() == 4 : "popFront is not working correctly";
        sLinkedList.pushFront(10);
        assert sLinkedList.valueAt(0) == 10 && sLinkedList.size() == 5 : "pushFront is not working correctly";
        int valueBack = sLinkedList.popBack();
        assert valueBack == 5 && sLinkedList.size() == 4 : "popBack is not working correctly";
        assert sLinkedList.front() == 10 : "front is returning an incorrect value";
        sLinkedList.erase(2);
        assert sLinkedList.valueAt(2) == 4 && sLinkedList.size() == 3 : "erase is not working correctly";
        assert sLinkedList.valueNFromEnd(0) == 4 : "valueFromEnd is returning an incorrect value";
        int headValue = sLinkedList.front();
        sLinkedList.reverse();
        int newHeadValue = sLinkedList.valueAt(sLinkedList.size()-1);
        assert newHeadValue == headValue : "reverse is working incorrectly";
        sLinkedList.removeValue(10);
        assert sLinkedList.front() == 4 : "remove value is not working";
    }
}
