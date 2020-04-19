package InterviewPrep.Solutions;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stackOfVals = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (stackOfVals.size() > 0 && stackOfVals.peek() == '(' && S.charAt(i) == ')') {
                stackOfVals.pop();
            } else {
                stackOfVals.push(S.charAt(i));
            }
        }
        return stackOfVals.size();
    }
}
