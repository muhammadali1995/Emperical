package ToptalPrep;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args) {
        NumberofStepstoReduceaNumbertoZero numbertoZero = new NumberofStepstoReduceaNumbertoZero();
        System.out.println(numbertoZero.numberOfSteps(8));
    }

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                num = num & (num - 1);
            } else {
                num = num >> 1;
            }
            steps++;

        }
        return steps;
    }
}
