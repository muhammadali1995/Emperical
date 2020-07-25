package Solutions.codility;

import java.util.Stack;

public class NestedString {
    public static void main(String[] args) {
        NestedString string = new NestedString();
        string.solution("{[()()]}");
    }

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (!stack.empty()) {
                char c1 = stack.peek();
                if (c1 == ']' || c1 == '}' || c1 == ')') return 0;
                if ((c1 == '(' && c == ')')
                        || (c1 == '[' && c == ']')
                        || (c1 == '{' && c == '}')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.size() == 0) return 1;
        else return 0;
    }
}
