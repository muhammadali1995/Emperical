package Solutions;

import java.util.Stack;

public class Nestin {
    public int solution(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (stack.empty()) stack.push(c);
            else {
                if (c == ')' && stack.peek() == ')') return 0;
                else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if (stack.size() == 0) return 1;
        else return 0;
    }
}
