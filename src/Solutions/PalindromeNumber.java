package Solutions;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-125));
    }

    public static boolean isPalindrome(int x) {
        int y = x;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        String xString = Integer.toString(x);
        int i = xString.length() - 1;
        int j = 0;
        while (i >= xString.length() / 2) {
            if (xString.charAt(i) != xString.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        int y = x;
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }
        int numberLength = (int) Math.floor(Math.log10(x));
        int i = numberLength;
        int firstPart;
        int secondPart;
        while (i >= numberLength / 2) {
            firstPart = x / (int) (Math.pow(10, i));
            x = (int) (x % Math.pow(10, i));
            secondPart = y % 10;
            y = y / 10;
            i--;
            if (firstPart != secondPart) {
                return false;
            }
        }
        return true;
    }
}
