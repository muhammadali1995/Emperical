package Solutions.array;

public class SortArray {
    public int[] sortArray(int[] nums) {
        int[] aux = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            aux[i] = nums[i];
        }
        sort(nums, aux, 0, nums.length - 1);
        return nums;
    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi)
    {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid) aux[k] = a[j++];
            else if (j > hi) aux[k] = a[i++];
            else if (a[j]< a[i]) aux[k] = a[j++];
            else aux[k] = a[i++];
        }
    }
    private static void sort(int[] a, int[] aux, int lo, int hi)
    {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort (aux, a, lo, mid);
        sort (aux, a, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
}
