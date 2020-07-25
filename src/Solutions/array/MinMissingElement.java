package Solutions.array;

import java.util.Arrays;

public class MinMissingElement {
    public int solution(int[] A) {
        if (A.length == 0 || A[A.length - 1] <= 0) return 1;
        Arrays.sort(A);
        if (A[0] > 0) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] > 1) return A[i] + 1;
            }
            if (A[0] != 1) return 1;
            else return A[A.length - 1] + 1;
        } else {
            int positiveStart = -1;
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    positiveStart = i;
                    break;
                }
            }
            if (A[positiveStart] > 1) return 1;
            else {
                for (int i = positiveStart; i < A.length - 1; i++) {
                    if (A[i + 1] - A[i] > 1) return A[i] + 1;
                }
                return A[A.length - 1] + 1;
            }
        }
    }
}
