package Solutions;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        double sum = 0;
        double count = 0;
        boolean isNegativeResult = false;
        if ((dividend < 0 && divisor > 0) | (dividend > 0 && divisor < 0)) isNegativeResult = true;
        double dividend2 = dividend<0?  (double) dividend*-1: dividend;
        double divisor2 = divisor<0?  (double) divisor*-1: divisor;

        while (dividend2 - sum >= divisor2) {
            sum += divisor2;
            count++;
        }
        if (count > Integer.MAX_VALUE) count = Integer.MAX_VALUE - 1;
        return (int) (isNegativeResult ? -1 * count : count);
    }
}
