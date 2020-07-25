package Solutions.codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        MissingInteger integer = new MissingInteger();
        integer.solution(new int[]{1, 2, 3});
    }
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] <= 0) return 1;
        if (A[0] > 1) return 1;
        if (A[0] > 0) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] - A[i] > 1) return A[i] + 1;
            }
            return A[A.length - 1]++;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i]>=0 && A[i + 1] - A[i] > 1) return A[i] + 1;
            }
            return A[A.length - 1]++;
        }

    }
}
