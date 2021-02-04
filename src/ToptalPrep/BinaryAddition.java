package ToptalPrep;

public class BinaryAddition {
    public static void main(String[] args) {
        BinaryAddition addition = new BinaryAddition();
        addition.addBinary("11", "1");
    }
    public String addBinary(String a, String b) {
        int maxSize = Math.max(a.length(), b.length());
        int[] aChars = new int[maxSize];
        int[] bChars = new int[maxSize];

        int j = maxSize - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            aChars[j--] = a.charAt(i)-'0';
        }

        j = maxSize - 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            bChars[j--] = b.charAt(i)-'0';
        }

        StringBuilder ans = new StringBuilder();

        int carry = 0;
        for (int i = maxSize - 1; i >= 0; i--) {
            int res = carry + (aChars[i]) + (bChars[i]);
            if (res == 2) {
                ans.insert(0, "0");
                carry = 1;
            } else if (res == 3) {
                ans.insert(0, "1");
                carry = 1;
            } else if (res <= 1) {
                ans.insert(0, res);
                carry = 0;
            }
        }
        if (carry == 1) {
            ans.insert(0, 1);
        }

        return ans.toString();

    }
}
