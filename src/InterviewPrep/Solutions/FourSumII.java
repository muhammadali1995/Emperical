package InterviewPrep.Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> firstPairs = getPairsSum(A, B);
        HashMap<Integer, Integer> secondPairs = getPairsSum(C, D);
        int count = 0;
        for (int key : firstPairs.keySet()) {
            int secondKey = key * (-1);
            if (secondPairs.containsKey(secondKey)) {
                count += (firstPairs.get(key) * secondPairs.get(secondKey));
            }
        }
        return count;
    }

    private HashMap<Integer, Integer> getPairsSum(int[] A, int[] B) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int key = A[i] + B[j];
                int size = 0;
                if (pairs.containsKey(key)) {
                   size = pairs.get(key);
                }
                size++;
                pairs.put(key, size);
            }
        }
        return pairs;
    }
}
