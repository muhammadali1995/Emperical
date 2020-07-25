package Solutions.array;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int numberOfZeros = 0;
        int incrementer = 1;
        if (n < 5) return numberOfZeros;
        else {
            int j = 0;
            while (j + 5 < n) {
                j += 5;
                if (j%25==0) incrementer++;
                System.out.println(incrementer);

                numberOfZeros += incrementer;
            }
        }

        return numberOfZeros;
    }
}
