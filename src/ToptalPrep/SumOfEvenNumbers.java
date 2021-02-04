package ToptalPrep;

import java.util.Arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();
        sumOfEvenNumbers.sumEvenAfterQueries(new int[]{8,-10,10,-7,4,-2}, new int[][]{{6, 4}, {-7, 0}, {-3, 5}, {6, 1}, {-8, 1}, {-10, 2}});
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        /*
         * A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
         *
         * */
        int sum = 0;
        for (int i : A) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        int[] output = new int[A.length];

        int index = 0;
        for (int[] query : queries) {

            int val = query[0];
            int i = query[1];

            int newVal = A[i] + val;
            if (A[i] % 2 == 0 && newVal % 2 == 0) {
                sum += val;
            } else if (A[i] % 2 == 0 && newVal % 2 != 0) {
                if (A[i]<0) {
                    sum += Math.abs(A[i]);
                }else {
                    sum -= A[i];
                }
            } else if (A[i] % 2 != 0 && newVal % 2 == 0) {
                sum += newVal;
            }
            output[index++] = sum;
            A[i] = newVal;
        }

        return output;


    }
}
