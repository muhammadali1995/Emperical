package Solutions.codility;


import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < A.length; i++) {
            while (B[i] == 0 && i < A.length) {
                stack.push(A[i]);
                i++;
            }
            for (int j = i + 1; j < A.length; j++) {

            }
        }
        return stack.size();
    }
}
