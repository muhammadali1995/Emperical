package Solutions.array;

public class FindNUniqueIntegersSumuptoZero {
    public int[] sumZero(int n) {
        int[] uniqueNumber = new int[n];
        int start = 0;
        if (n % 2 == 0) {
            for (int i = -n / 2 + 1; i < n / 2; i++) {
                if (i != 0) uniqueNumber[start++] = i;
            }
        } else {
            for (int i = -n / 2 + 1; i < n / 2; i++) {
                uniqueNumber[start++] = i;
            }
        }
        return uniqueNumber;
    }
}
