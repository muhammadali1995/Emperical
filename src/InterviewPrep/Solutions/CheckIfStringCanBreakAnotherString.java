package InterviewPrep.Solutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckIfStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        boolean firstbool = true;
        for (int i = 0; i < s1Chars.length; i++) {
            if (!(s1Chars[i] >= s2Chars[i])) {
                firstbool = false;
                break;
            }
        }
        if (firstbool) return true;

        firstbool = true;

        for (int i = 0; i < s1Chars.length; i++) {
            if (!(s1Chars[i] <= s2Chars[i])) {
                firstbool = false;
                break;
            }
        }

        return firstbool;
    }
}
