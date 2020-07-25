package Solutions.codility;

import java.util.Arrays;

public class ProductOfTriplets {
    public static void main(String[] args) {
        ProductOfTriplets productOfTriplets = new ProductOfTriplets();
        System.out.println(productOfTriplets.solution(new int[]{-5, -4, -3, 1, 2, 4}));
    }
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[0] > 0 || (A[0] < 0 && A[A.length - 1] < 0)) {
            return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < A.length - 2; i++) {
                for (int j = i + 1; j < A.length - 1; j++) {
                    for (int k = j + 1; k < A.length; k++) {
                        int result = A[k] * A[j] * A[i];
                        if (result > max) max = result;
                    }
                }
            }
            return max;
        }
    }
}
