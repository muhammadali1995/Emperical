package Solutions;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {

        double reversedNumber = 0;
        int j = x > 0 ? 1 : 2;
        int i = Integer.toString(x).length() - j;

        while (i >= 0) {
            reversedNumber += (x % 10) * Math.pow(10, i);
            x = x / 10;
            i--;
        }

        if (reversedNumber < Math.pow(-2, 31) || (reversedNumber > (Math.pow(2, 31) - 1))) {
            return 0;
        }

        return (int) reversedNumber;
    }
}
