package Solutions.codility;

public class Tape {
    public static void main(String[] args) {
        Tape tape = new Tape();
        System.out.println(tape.solution(new int[]{-3,-7}));
    }

    public int solution(int[] A) {
        if (A.length < 1) return 0;
        if (A.length == 1) return A[0];

        int leftSum = A[0];
        int rightSum = 0;
        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }

        int minDiff = Math.abs(leftSum - rightSum);

        for (int i = 1; i < A.length; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            minDiff = Math.min(minDiff, Math.abs(leftSum - rightSum));
        }
        return minDiff;
    }
}
