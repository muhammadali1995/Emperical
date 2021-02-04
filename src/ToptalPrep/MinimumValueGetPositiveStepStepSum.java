package ToptalPrep;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumValueGetPositiveStepStepSum {
    public int minStartValue(int[] nums) {
        int min = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : nums) {
            if (a > 0) list.add(a);
        }

        Collections.sort(list);
        for (int a : list) {
            if (isValid(a, nums)) return a;
        }

        return min;
    }


    boolean isValid(int i, int[] nums) {

        for (int a : nums) {
            i = i + a;
            if (i < 1) return false;
        }

        return true;
    }

}



