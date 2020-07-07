package Solutions.array;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        return null;
    }

    private void sort(int[][] intervals) {
        int[][] aux = new int[intervals.length][];
        sort(intervals, aux, 0, aux.length - 1);
        System.out.println(Arrays.toString(intervals));
    }

    private void sort(int[][] a, int[][] aux, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    public void merge(int[][] a, int[][] aux, int low, int mid, int hi) {
        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        int i = low, j = mid + 1;
        for (int k = 0; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j][0] < aux[i][0]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }


}
