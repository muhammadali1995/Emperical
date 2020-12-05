package ToptalPrep;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractProductSumDigitsInteger {
    public static void main(String[] args) {
        SubtractProductSumDigitsInteger s = new SubtractProductSumDigitsInteger();
        System.out.println(s.subtractProductAndSum(2));
    }

    public int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;

        while (n >= 1) {
            int remainder = n % 10;
            n = n / 10;
            sumOfDigits += remainder;
            productOfDigits *= remainder;
        }
        return productOfDigits - sumOfDigits;
    }
}
