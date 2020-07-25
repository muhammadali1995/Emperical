package Solutions.codility;

public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        System.out.println(frogRiverOne.solution(6, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    public int solution(int X, int[] A) {
        int count = X;
        int[] positions = new int[X + 1];
        for (int i = 0; i < A.length; i++) {
            if (positions[A[i]] == 0) {
                count--;
                positions[A[i]] = A[i];
                if (count == 0) return i;
            }
        }

        return -1;
    }
}
