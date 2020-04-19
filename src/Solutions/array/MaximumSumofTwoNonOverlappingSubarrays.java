package Solutions.array;

public class MaximumSumofTwoNonOverlappingSubarrays {


    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int firstMax = 0;
        int secondMax = 0;
        int startIndex = 0;
        if (M > L) {
            for (int j = 0; j < M; j++) {
                firstMax += A[j];
            }
            int k = 0;
            int currentresult = firstMax;
            for (int i = M; i < A.length; i++) {
                currentresult = currentresult - A[k] + A[i];
                k++;
                if (currentresult > firstMax) {
                    firstMax = currentresult;
                    startIndex = i - M;
                }
            }
        } else {
            for (int j = startIndex; j < L; j++) {
                secondMax += A[j];
            }
            int k = 0;
            for (int i = L; i < A.length; i++) {
                int currentresult = secondMax - A[k] + A[i];
                k++;
                if (currentresult > secondMax) secondMax = currentresult;
            }
        }
        return firstMax + secondMax;
    }
}
