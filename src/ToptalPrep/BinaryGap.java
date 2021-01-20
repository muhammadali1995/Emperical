package ToptalPrep;

public class BinaryGap {
    public int binaryGap(int n) {
        int max = 0;
        int count = 0;
        boolean met1 = false;

        while (n > 0) {
            if (n % 2 == 1) {
                max = Math.max(count, max);
                count = 1;
                met1 = true;
            } else if (met1) {
                count++;
            }
            n = n >> 1;
        }

        return max;
    }
}
