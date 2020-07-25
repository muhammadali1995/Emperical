package Solutions.codility;

import java.util.HashSet;

public class DistinctValues {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}
