package Solutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        LinkedList<int[]> result = new LinkedList<>();
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int[] compare = intervals[0];
        result.add(compare);
        for (int [] interval: intervals) {
            if (compare[1] >= interval[0]) {
                compare[1] = Math.max(interval[1], compare[1]);
            } else {
                compare = interval;
                result.add(compare);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

//    private void sort(int[][] intervals) {
//        int[][] aux = new int[intervals.length][];
//        sort(intervals, aux, 0, aux.length - 1);
//    }
//
//    private void sort(int[][] a, int[][] aux, int lo, int hi) {
//        if (hi <= lo) return;
//        int mid = lo + (hi - lo) / 2;
//        sort(a, aux, lo, mid);
//        sort(a, aux, mid + 1, hi);
//        merge(a, aux, lo, mid, hi);
//    }
//
//    private void merge(int[][] a, int[][] aux, int low, int mid, int hi) {
//        System.arraycopy(a, 0, aux, 0, a.length);
//        int i = low, j = mid + 1;
//        for (int k = low; k <= hi; k++) {
//            if (i > mid) a[k] = aux[j++];
//            else if (j > hi) a[k] = aux[i++];
//            else if (aux[j][0] < aux[i][0]) a[k] = aux[j++];
//            else a[k] = aux[i++];
//        }
//    }
}