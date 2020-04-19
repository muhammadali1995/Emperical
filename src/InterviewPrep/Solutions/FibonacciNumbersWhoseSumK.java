package InterviewPrep.Solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class FibonacciNumbersWhoseSumK {
    public int findMinFibonacciNumbers(int k) {

        Stack<Integer> fibonacciNumbers = new Stack<>();
        int lastFibonaci = 1;
        int preLastFibonacci = 1;
        fibonacciNumbers.add(lastFibonaci);
        while (lastFibonaci<=k){
            int temp = preLastFibonacci;
            preLastFibonacci = lastFibonaci;
            lastFibonaci = lastFibonaci + temp;
            if (lastFibonaci<=k) fibonacciNumbers.add(lastFibonaci);
        }

        int sum = 0;
        int count = 0;
        while (sum != k) {
            count++;
            sum += fibonacciNumbers.peek();
            int val = fibonacciNumbers.pop();
            if (sum > k) {
                sum -= val;
                count--;
            }
        }
        return count;
    }
}
