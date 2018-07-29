package Solutions;


public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 3};
        int[] arr2 = new int[]{5, 6, 4};
        ListNode l1 = new ListNode(arr1[0]);
        ListNode l2 = new ListNode(arr2[0]);
        ListNode tmp = l1;
        ListNode tmp2 = l2;

        for (int i = 1; i < arr1.length; i++) {
            tmp.next = new ListNode(arr1[i]);
            tmp = tmp.next;
        }

        for (int i = 1; i < arr2.length; i++) {
            tmp2.next = new ListNode(arr2[i]);
            tmp2 = tmp2.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean hasNext = true;
        int remainder, result;

        int sum = l1.val + l2.val;
        remainder = sum % 10;
        result = sum / 10;
        ListNode sumNode = new ListNode(remainder);
        ListNode tmp = sumNode;
        l1 = l1.next;
        l2 = l2.next;
        while (hasNext) {

            if (l1 == null && l2 == null) {
                hasNext = false;
                if (result > 0) {
                    tmp.next = new ListNode(result % 10);
                }
                break;
            }

            if (l1 != null) {
                result += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                result += l2.val;
                l2 = l2.next;
            }

            tmp.next = new ListNode(result % 10);
            result = result / 10;
            tmp = tmp.next;
        }

        return sumNode;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        double numberOne = 0;
        double numberTwo = 0;
        double i = 0;

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

        return new ListNode(val);
    }

}


