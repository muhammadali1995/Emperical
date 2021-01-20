package ToptalPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LuckyNumber {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int[] mins = new int[m];
        int[] maxs = new int[n];

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            mins[i] = min;
        }

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxs[i] = max;
        }

        /*
         *
         * [
         *   [1,10,4,2],
         *   [9,3,8,7],
         *   [15,16,17,12]
         * ]
         *
         * min = 1,3,12
         * max 15, 16, 17, 12
         *
         * */


        HashSet<Integer> vals = new HashSet<>();


        for (int i : mins) {
            vals.add(i);
        }

        for (int i : maxs) {
            if (vals.contains(i)) {
                ans.add(i);
            }
        }


        return ans;

    }
}
