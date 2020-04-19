package InterviewPrep.DataStucture.SLinkedList;

class SNode {
    int value;
    SNode next;

    public SNode(int value) {
        this.value = value;
        this.next = null;
    }

    public SNode(int value, SNode node) {
        this.value = value;
        this.next = node;
    }

    SNode nth(int index) {
        return nthHelper(this, index);
    }

    private SNode nthHelper(SNode node, int index) {
        if (index == 0) {
            return node;
        }
        return nthHelper(node.next, --index);
    }

}

public class SLinkedList {
    private SNode head;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public int valueAt(int index) {
        return head.nth(index).value;
    }

    public void pushFront(int value) {
        this.head = new SNode(value, head);
        ++size;
    }

    public int popFront() {
        int value = head.value;
        this.head = this.head.next;
        --size;
        return value;
    }

    public void pushBack(int value) {
        if (size==0) {
            this.head = new SNode(value);
        }else {
            SNode lastNode = this.head.nth(size-1);
            lastNode.next = new SNode(value);
        }
        ++size;
    }

    public int popBack() {
        SNode preLastNode = head.nth(size - 2);
        int value = preLastNode.next.value;
        preLastNode.next = null;
        --size;
        return value;
    }

    public int front() {
        return head.value;
    }

    public int back() {
        return this.head.nth(size).value;
    }

    public void insert(int index, int value) {
        SNode preIndexNode = this.head.nth(index - 1);
        preIndexNode.next = new SNode(value, preIndexNode.next);
        ++size;
    }

    public void erase(int index) {
        SNode preIndexNode = this.head.nth(index - 1);
        if (preIndexNode.next != null) preIndexNode.next = preIndexNode.next.next;
        --size;
    }

    public int valueNFromEnd(int n) {
        if (n-1 > size) {
            return -1;
        }
        return this.head.nth(size -n-1).value;
    }

    public void reverse() {
        SNode temp = this.head.next;
        size = 1;
        this.head.next = null;
        while (temp != null) {
            pushFront(temp.value);
            temp = temp.next;
        }
    }

    public void removeValue(int value) {
        if (head.value == value) {
            head = head.next;
        }else  {
            SNode node = removeValueHelper(head, value);
            if (node.next!=null) node.next = node.next.next; --size;
        }
    }


    private SNode removeValueHelper(SNode node, int value) {
        if (node.next==null || node.next.value == value) {
            return node;
        }
        return removeValueHelper(node.next, value);
    }
}
