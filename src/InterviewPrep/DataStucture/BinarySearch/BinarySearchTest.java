package InterviewPrep.DataStucture.BinarySearch;

public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearchRecursion binarySearch = new BinarySearchRecursion();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assert binarySearch.binarySearch(4, arr) == 3 : "should have been 3";
    }
}
