package InterviewPrep.Solutions;


import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return buildS(S).equals(buildS(T));
    }

    private String buildS(String S){
        Stack<Character> charsOfT = new Stack<>();

        for (char c : S.toCharArray()) {
            if (!charsOfT.isEmpty()&& (c == '#')) {
                charsOfT.pop();
            } else {
                if (c != '#') charsOfT.push(c);
            }
        }

        return String.valueOf(charsOfT);
    }
}
