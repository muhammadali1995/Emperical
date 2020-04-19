package InterviewPrep.Solutions;

import Solutions.ListNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};

        int k = 0;
        int[] testVal = new int[]{-22,-29,-21,0,-4,-26,10,-11,-14,-11};
        String s = " ";
        int[][] shift = new int[][]{{0, 1}, {1, 2}};
        String[] vals = new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"};
        String vl ="*))";

        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("Laure");
        list.add("3");
        list.add("Ceviche");

        List<String> list2= new ArrayList<>();
        list2.add("Jhon");
        list2.add("10");
        list2.add("Beef Burrito");

        List<String> list3= new ArrayList<>();
        list3.add("Melissa");
        list3.add("3");
        list3.add("Fried Chicken");

        List<String> list4= new ArrayList<>();
        list4.add("Carla");
        list4.add("5");
        list4.add("Water");

        List<String> list5= new ArrayList<>();
        list5.add("Carla");
        list5.add("3");
        list5.add("Ceviche");


        list3.add("Carla");
        list3.add("3");
        list3.add("Ceviche");

        lists.add(list);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        lists.add(list5);
        DisplayTableFoodOrdersRestaurant backspaceStringCompare = new DisplayTableFoodOrdersRestaurant();

        System.out.println(backspaceStringCompare.displayTable(lists));
    }


    public static ListNode constructList(ListNode head, int[] values) {
        ListNode node = head;
        for (int i = 1; i < values.length; i++) {
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        return head;
    }
}
