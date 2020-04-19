package InterviewPrep.Solutions;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {

        if (s.length() > 0 && (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(')) return false;
        int fast = 1;
        int slow = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (slow < fast && fast < stringBuilder.length()) {
            if (stringBuilder.charAt(slow) == '(' && stringBuilder.charAt(fast) == ')') {
                stringBuilder.deleteCharAt(slow);
                if (slow > 0) slow--;
                fast--;
                stringBuilder.deleteCharAt(fast);
                fast--;
            } else if (stringBuilder.charAt(slow) != '(') {
                slow++;
            } else if (stringBuilder.charAt(fast) != ')') {
                if (stringBuilder.charAt(fast) == '(') slow = fast;
                fast++;
            }
            if (slow >= fast) fast = slow + 1;

            if ((fast >= stringBuilder.length() || fast <= slow) && stringBuilder.indexOf("(") > -1 && stringBuilder.lastIndexOf(")") > stringBuilder.indexOf("(")) {
                slow = 0;
                fast = 1;
            }
        }

        slow = 0;
        fast = 1;
        while (slow < fast && fast < stringBuilder.length()) {
            if (stringBuilder.charAt(slow) == '(' && stringBuilder.charAt(fast) == ')' || (stringBuilder.charAt(slow) == '*' && stringBuilder.charAt(fast) == ')') || (stringBuilder.charAt(slow) == '(' && stringBuilder.charAt(fast) == '*')) {
                stringBuilder.deleteCharAt(slow);
                if (slow > 0) slow--;
                fast--;
                stringBuilder.deleteCharAt(fast);
                if (slow >= fast) fast = slow + 1;
            } else if (stringBuilder.charAt(slow) != '(') {
                slow++;
                if (slow == fast) fast++;
            } else if (stringBuilder.charAt(fast) != ')') {
                fast++;
            }
        }
        if (stringBuilder.indexOf(")") > -1 || stringBuilder.indexOf("(") > -1) return false;
        return true;
    }
}
