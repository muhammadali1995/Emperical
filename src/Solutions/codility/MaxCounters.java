package Solutions.codility;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        MaxCounters maxCounters = new MaxCounters();
        System.out.println(Arrays.toString(maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }

    public int[] solution(int N, int[] A) {

        int maxCountLastIndex = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(A[i], max);
            if (A[i] == N + 1) {
                maxCountLastIndex = i;
            }
        }

        int[] count = new int[max+1];
        int maxCount = 0;
        for (int i = 0; i <= maxCountLastIndex; i++) {
            count[A[i]]++;
            maxCount = Math.max(maxCount, count[A[i]]);
        }

        int[] counters = new int[N];
        Arrays.fill(counters, maxCount);
        for (int j = maxCountLastIndex+1; j<A.length;  j++) {
            if (A[j] <= N && A[j] > 0) {
                counters[A[j] - 1]++;
                maxCount = Math.max(counters[A[j] - 1], maxCount);
            }
        }
        return counters;
    }
}
