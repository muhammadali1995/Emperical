package InterviewPrep.Solutions;

import java.util.ArrayList;

public class QueriesPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> result = new ArrayList<>(m);
        int[] P = new int[queries.length];
        for (int i = 0; i <m+1; i++) {
            result.add(i+1);
        }

        for (int i = 0; i <queries.length; i++) {
            int curr = queries[i];
            int index = result.indexOf(curr);
            P[i] = index;
            result.remove(index);
            result.add(0, curr);
        }
        return P;
    }
}
