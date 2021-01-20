package ToptalPrep;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }

    public boolean isHappy(int n) {
        while (n > 1) {
            int a = n;
            int sum = 0;
            while (a > 0) {
                sum += Math.pow(a % 10, 2);
                a /= 10;
            }

            if (sum == n) return false;

            n = sum;

        }
        return n == 1;
    }
}
