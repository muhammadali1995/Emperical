package ToptalPrep;

public class IsSubSequence {
    public static void main(String[] args) {
        IsSubSequence subSequence = new IsSubSequence();
        subSequence.isSubsequence("", "abc");
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        char [] sLetters = s.toCharArray();
        char [] tLetters = t.toCharArray();
        for (char c : tLetters) {
            if (i<s.length() && c==sLetters[i]) {
                i++;
            }
        }

        return i == s.length() - 1;
    }
}
