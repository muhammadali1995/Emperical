package Solutions;

/**
 * Created by User on 7/22/2018.
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavsjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc"));
    }

    public static String longestPalindrome(String s) {
        String maxPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                String subString = s.substring(i, j);
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
        int n = s.length();

        if (n == 1) {
            return true;
        }

        if (n % 2 == 1) {
            String firstPart = s.substring(0, n / 2 + 1);
            String secondPart = s.substring(n / 2, n);
            for (int i = 0, j = secondPart.length() - 1; i < firstPart.length(); i++, j--) {
                if (firstPart.charAt(i) != secondPart.charAt(j)) {
                    palindrome = false;
                }
            }
            return palindrome;
        }

        String firstPart = s.substring(0, n / 2);
        String secondPart = s.substring(n / 2, n);
        for (int i = 0, j = secondPart.length() - 1; i < firstPart.length(); i++, j--) {
            if (firstPart.charAt(i) != secondPart.charAt(j)) {
                palindrome = false;
            }
        }
        return palindrome;
    }

}
