package InterviewPrep.DataStucture.BinarySearch;

public class BinarySearchRecursion {
    public int binarySearch(int target, int[] values) {
        return binarySearchHelper(0, values.length - 1, target, values);
    }

    private int binarySearchHelper(int min, int max, int target, int[] arr) {
        if (max < min) {
            return -1;
        }
        int mid = min + max / 2;
        if (arr[mid] < target) {
            return binarySearchHelper(mid + 1, max, target, arr);
        } else if (arr[mid] > target) {
            return binarySearchHelper(min, mid - 1, target, arr);
        } else {
            return mid;
        }
    }
}
