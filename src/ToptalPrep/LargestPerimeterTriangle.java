package ToptalPrep;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        LargestPerimeterTriangle perimeterTriangle = new LargestPerimeterTriangle();
        perimeterTriangle.largestPerimeter(new int[]{3, 6, 2, 3});
    }

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        for (int i = A.length - 1; i > 1; i--) {
            for (int j = i - 2; j >= 0; j--) {
                if (A[i] + A[i - 1] > A[j] && A[i] + A[j] > A[i - 1] && A[i - 1] + A[j] > A[i])
                    return A[i] + A[j] + A[i - 1];
            }
        }

        return 0;


    }
}
