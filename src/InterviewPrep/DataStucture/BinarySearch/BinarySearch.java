package InterviewPrep.DataStucture.BinarySearch;

public class BinarySearch {

    public int binarySearch(int target, int[] arr) {
        int min = 0;
        int max = arr.length;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (target < arr[mid])
                max = mid - 1;
            else if (target > arr[mid])
                min = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
