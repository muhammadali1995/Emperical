package ToptalPrep;

public class SumOfOddLengthSubArr {
    public static void main(String[] args) {
        SumOfOddLengthSubArr subArr = new SumOfOddLengthSubArr();
        subArr.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});
    }

    public int sumOddLengthSubarrays(int[] arr) {
        if (arr.length == 0) return 0;

        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            sum += findSumOfFirstN(i, arr);
        }

        return sum;

    }


    private int findSumOfFirstN(int n, int[] arr) {
        int total = 0;
        int sw = 0;
        for (int i = 0; i < n; i++) {
            sw += arr[i];
        }

        total += sw;

        int slow = 0;
        for (int i = n; i < arr.length; i++) {
            sw = Math.abs((sw + arr[i] - arr[slow++]));
            total+=sw;
        }

        return total;
    }
}
