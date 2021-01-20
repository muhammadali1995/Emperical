package ToptalPrep;

public class TransposeMatrix {
    public static void main(String[] args) {

        TransposeMatrix matrix = new TransposeMatrix();
        matrix.transpose(new int[][]{
                {1, 2, 3}, {4, 5, 6}
        });

    }

    public int[][] transpose(int[][] A) {
        int size = A.length;
        int[][] ans = new int[A[0].length][size];

        for (int l = 0, i = 0; i < size; i++, l++) {
            for (int j = 0, k = 0; j < A[0].length; j++, k++) {
                ans[k++][l] = A[i][j];
                if (k == A[0].length) k = 0;

            }
            if (l == size) l = 0;

        }

        return ans;
    }
}
