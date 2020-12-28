package ToptalPrep;

public class ResverseWords {
    public static void main(String[] args) {
        ResverseWords reverseString = new ResverseWords();

        System.out.println(reverseString.reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            if (builder.length() > 0) {
                builder.append(" ");
            }
            builder.append(reverse(word));
        }
        return builder.toString();

    }


    private String reverse(String word) {
        int i = 0;
        int j = word.length() - 1;
        char[] letters = word.toCharArray();
        while (i < j) {
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(letters);
    }
}
