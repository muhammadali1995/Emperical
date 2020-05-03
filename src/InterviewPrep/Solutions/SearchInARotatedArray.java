package InterviewPrep.Solutions;

public class SearchInARotatedArray {
    public int search(int[] nums, int target) {
        int biggest = findBiggest(nums);
        System.out.println("biggest" + biggest);
        return biggest;
    }

    public int findBiggest(int[] A) {
        int min = 0;
        int max = A.length - 1;
        int mid;
        while (min < max) {
            mid = (min + max) / 2;
            if ((mid == 0 && A[mid] > A[mid + 1]) || (mid != 0 && A[mid] > A[mid - 1] && A[mid] > A[mid + 1])) {
                return mid;
            } else {
                if (A[mid] > A[mid-1] && A[mid] < A[mid + 1]) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        return min;
    }
}