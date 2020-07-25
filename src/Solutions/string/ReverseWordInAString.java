package Solutions.string;

import java.util.Arrays;

public class ReverseWordInAString {
    public static void main(String[] args) {
        ReverseWordInAString reverseWordInAString = new ReverseWordInAString();
        System.out.println(reverseWordInAString.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int i = 0;
        for (String word : words) {
            words[i] = reverse(word.toCharArray());
            i++;
        }
        StringBuilder result = new StringBuilder();
        int j = 0;
        for (String word : words) {
            result.append(word);
            if (j < words.length - 1) result.append(" ");
        }
        return result.toString();
    }

    public String reverse(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = c;
        }
        return String.valueOf(chars);
    }
}
