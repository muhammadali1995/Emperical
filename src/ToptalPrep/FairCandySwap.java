package ToptalPrep;

import java.util.HashMap;
import java.util.HashSet;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {

        int avg;
        HashSet<Integer> bMap = new HashSet<>();
        int aSum = 0;
        int bSum = 0;
        for (int a : A) {
            aSum += a;
        }

        for (int a : B) {
            bSum += a;
            bMap.add(a);
        }


        avg = (aSum + bSum) / 2;

        for (int j : A) {
            if (bMap.contains(bSum + j - avg)) return new int[]{j, bSum + j - avg};
        }

        return new int[]{};

    }
}
