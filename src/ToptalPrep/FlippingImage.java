package ToptalPrep;

public class FlippingImage {
    public static void main(String[] args) {
        FlippingImage flippingImage = new FlippingImage();
        flippingImage.flipAndInvertImage(new int[][]{
                {1, 1, 0},
                {1, 0, 0},
                {0, 1, 1},
        });
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - j - 1];
                A[i][A.length - j - 1] = temp;
            }
        }
        return A;
    }

    public int swap(int n) {
        if (n == 1) return 0;
        else return 1;
    }
}
