package Solutions.codility;

public class MinSlice {
    public static void main(String[] args) {
        MinSlice slice = new MinSlice();
        System.out.println(slice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    public int solution(int[] A) {
        int sliceCount = 2;
        double minAverage = Integer.MAX_VALUE;
        int start = 0;
        while (sliceCount < A.length) {
            int initialSum = 0;
            for (int i = 0; i < sliceCount; i++) {
                initialSum += A[i];
            }
            double currAva = initialSum / (double) sliceCount;
            if (currAva < minAverage) {
                minAverage = currAva;
                start = 0;
            }

            for (int i = 1; i < A.length - sliceCount + 1; i++) {
                initialSum -= A[i - 1];
                initialSum += A[sliceCount - 1 + i];
                currAva = initialSum / (double) sliceCount;
                if (currAva < minAverage) {
                    minAverage = currAva;
                    start = i;
                }
            }
            sliceCount++;
        }
        return start;
    }
}
