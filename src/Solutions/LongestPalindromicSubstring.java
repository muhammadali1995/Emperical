package Solutions;

/**
 * Created by User on 7/22/2018.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("barra"));
    }

    public static String longestPalindrome(String s) {
        String maxPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                String subString = s.substring(i, j);
                if (subString.length() < maxPalindrome.length()) {
                    break;
                }
                if (isPalinrome(subString)) {
                    if (subString.length() > maxPalindrome.length()) {
                        maxPalindrome = subString;
                    }
                }
            }

        }

        return maxPalindrome;
    }

    public static boolean isPalinrome(String s) {
        boolean palindrome = true;
        int n = s.length() - 1;
        int i = 0;
        while (i <= n) {
            if (s.charAt(i) != s.charAt(n)) {
                palindrome = false;
                break;
            }
            i++;
            n--;
        }
        return palindrome;
    }

}
