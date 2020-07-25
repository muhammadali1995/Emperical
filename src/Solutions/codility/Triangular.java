package Solutions.codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Triangular {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2] && A[i + 1] + A[i + 2] > A[i] && A[i] + A[i + 2] > A[i + 1]) return 1;
        }
        return 0;
    }
}
