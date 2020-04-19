package InterviewPrep.Solutions;

public class SearchInsertPosition {
    public int searchInsert(int[] values, int target) {
        int min = 0;
        int max = values.length;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (mid==values.length) return min;
            if (target < values[mid])
                max = mid - 1;
            else if (target > values[mid])
                min = mid + 1;
            else
                return mid;
        }
        return min;
    }
}
