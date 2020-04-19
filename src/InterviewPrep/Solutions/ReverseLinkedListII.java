package InterviewPrep.Solutions;
import Solutions.ListNode;

public class ReverseLinkedListII {
    int lastIndex;
    int firstIndex = 1;
    int numberOfSwaps = 0;
    ListNode head1;
    int secondIndex = 0;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        numberOfSwaps = (n - m) / 2;
        lastIndex = n;
        head1 = head;
        ListNode helperNode = head;
        int index = 1;
        while (helperNode != null && n >= index) {
            if (index == m) {
                firstIndex = m;
                return reverse(helperNode);
            }
            head1 = head1.next;
            index++;
            helperNode = helperNode.next;
        }
        return head;
    }

    public ListNode reverse(ListNode node){
        if (firstIndex == lastIndex) {
            return node;
        }
        firstIndex++;
        ListNode node1 = reverse(node.next);
        if (secondIndex<numberOfSwaps){
            int temp = node1.val;
            node1.val = head1.val;
            head1.val = temp;
            secondIndex++;
        }
        head1 = head1.next;
        return node;
    }
}
