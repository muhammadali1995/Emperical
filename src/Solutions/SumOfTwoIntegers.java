package Solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
        System.out.println(sumOfTwoIntegers.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
    }


    public double averageWaitingTime(int[][] customers) {

        double allTimeSpent = 0;
        double startTime = customers[0][0];
        for (int i = 0; i < customers.length; i++) {
            if (startTime < customers[i][0]) {
                startTime = customers[i][0] + customers[i][1];
            } else {
                startTime += customers[i][1];
            }
            allTimeSpent += startTime - customers[i][0];
        }

        return allTimeSpent / (double) customers.length;
    }


    public int countStudents(int[] students, int[] sandwiches) {


        Stack<Integer> sStack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }
        boolean myBo = false;
        for (int i = 0; i < sandwiches.length; i++) {
            int j = 0;
            while (j < queue.size() && !queue.isEmpty()) {
                int s = queue.poll();
                myBo = false;
                if (s != sandwiches[i]) {
                    queue.add(s);
                } else {
                    myBo = true;
                    break;
                }
                j++;
            }

            if (j == queue.size() && !myBo) {
                return queue.size();
            }
        }

        return 0;
    }



}
