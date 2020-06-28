package Solutions.string;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        helper(0, s);
        System.out.println(Arrays.toString(s));
    }

    public void helper(int index, char[] s) {
        if (s == null || index >= s.length) {
            return;
        }
        helper(index + 1, s);
        if (index >= s.length / 2) {
            char c = s[s.length-index-1];
            s[s.length-index-1] = s[index];
            s[index] = c;
        }
    }
}
