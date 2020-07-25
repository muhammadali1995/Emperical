package Solutions.array;

import java.util.HashMap;

public class OddNumberInArray {
    public int solution(int[] A) {
        if (A.length<=1) return A[0];
        HashMap<Integer, Integer> mapOfVals = new HashMap<>();
        for (int i = 0; i <A.length; i++) {
            mapOfVals.put(A[i], mapOfVals.getOrDefault(A[i], 0) + 1);
        }

        for (int key: mapOfVals.keySet()) {
            if (mapOfVals.get(key)%2==1) return key;
        }

        return -1;
    }
}
