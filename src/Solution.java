public class Solution {


    public static void main(String[] args) {

        int[] arr1 = new int[]{9};
        int[] arr2 = new int[]{1, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        ListNode l1 = new ListNode(arr1[0]);
        ListNode l2 = new ListNode(arr2[0]);
        ListNode tmp = l1;
        ListNode tmp2 = l2;
        l2.next = new ListNode(9);


        for (int i = 1; i < arr1.length; i++) {
            tmp.next = new ListNode(arr1[i]);
            tmp = tmp.next;
        }

        for (int i = 1; i < arr2.length; i++) {
            tmp2.next = new ListNode(arr2[i]);
            tmp2 = tmp2.next;
        }
        System.out.println(l2);

        ListNode node = addTwoNumbers(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int numberOne = 0;
        int numberTwo = 0;
        double i = 0;

        boolean hasNext = true;

        ListNode sumNode;
        int j = 0;

        while (hasNext) {

            if (l1.next == null && l2.next == null) {
                hasNext = false;
            }

            if (j == 0) {
            /*    sumNode = new ListNode();*/
            }
            j++;



        }

        while (l1 != null) {
            numberOne += l1.val * Math.pow(10, i);
            l1 = l1.next;
            i++;
        }

        i = 0;
        while (l2 != null) {
            numberTwo += l2.val * Math.pow(10, i);
            l2 = l2.next;
            i++;
        }

        int val = (int) (numberOne + numberTwo);

        ListNode sumNode = new ListNode(val % 10);
        ListNode temp = sumNode;
        val = val / 10;
        while (val > 0) {
            int remainder = val % 10;
            temp.next = new ListNode(remainder);
            temp = temp.next;
            val = val / 10;
        }

        return sumNode;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}