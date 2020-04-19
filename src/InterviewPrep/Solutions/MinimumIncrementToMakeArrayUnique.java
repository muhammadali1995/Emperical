package InterviewPrep.Solutions;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] A) {
        int countOfMoves = 0;
        int[] values = new int[40000];
        for (int i = 0; i <A.length ; i++) {
            if (values[A[i]] !=A[i]) {
                values[A[i]] = A[i];
            }
        }


        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            if (values[temp] == temp) continue;
            while (values[temp] == temp) {
                countOfMoves++;
                temp++;
            }
            values[temp] = temp;
        }

        return countOfMoves;
    }

    public int minIncrementForUnique2(int[] A) {
        HashMap<Integer, Integer> mapOfValues = new HashMap<>();
        HashMap<Integer, Integer> mapOfMultipleValues = new HashMap<>();
        int countOfMinimumMoves = 0;
        for (int i = 0; i < A.length; i++) {
            if (mapOfValues.get(A[i]) == null) {
                mapOfValues.put(A[i], 1);
            } else {
                if (mapOfMultipleValues.get(A[i]) == null) {
                    mapOfMultipleValues.put(A[i], 2);
                } else {
                    int value = mapOfMultipleValues.get(A[i]);
                    mapOfMultipleValues.put(A[i], ++value);
                }
            }
        }

        for (int key : mapOfMultipleValues.keySet()) {
            int newKey = key;
            for (int j = mapOfMultipleValues.get(key) - 1; j >= 1; j--) {
                countOfMinimumMoves += newKey - key;
                while (mapOfValues.get(newKey) != null) {
                    newKey++;
                    countOfMinimumMoves++;
                }
                mapOfValues.put(newKey, 1);
            }
        }
        return countOfMinimumMoves;
    }

}
