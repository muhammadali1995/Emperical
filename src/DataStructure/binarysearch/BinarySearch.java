package DataStructure.binarysearch;

/**
 * Created by User on 7/29/2018.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int result = doBinarySearch(primes, 73);
        System.out.println(result);
    }

    public static int doBinarySearch(int[] array, int targetValue) {
        int min = 0;
        int max = array.length - 1;
        int guess;
        while (max >= min) {
            guess = Math.round((max + min)/2);
            if (array[guess] == targetValue) {
                return guess;
            } else if (array[guess] < targetValue) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }
}
