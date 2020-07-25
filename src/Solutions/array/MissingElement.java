package Solutions.array;

import java.util.Arrays;

public class MissingElement {
    public int solution(int[] A) {
        if (A.length == 0) return 1;
        Arrays.sort(A);
        int ongoing = 1;
        for (int a : A) {
            if (ongoing == a) ongoing++;
            else return ongoing;
        }
        return A[A.length - 1] + 1;
    }
}
