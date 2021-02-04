package ToptalPrep;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        reverseOnlyLetters.reverseOnlyLetters("?6C40E");
    }
    public String reverseOnlyLetters(String S) {
        int i = 0;
        int j = S.length() - 1;

        StringBuilder sb = new StringBuilder(S);
        while (i < j) {
            while (i<S.length() && !Character.isLetter(S.charAt(i))) {
                i++;
            }
            while (j>=0 && !Character.isLetter(S.charAt(j))) {
                j--;
            }
            if(i<S.length() && j>-1&& i<j){
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }

        }


        return  sb.toString();

    }

    boolean isLetter(char c){

        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');

    }
}
