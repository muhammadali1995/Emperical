package InterviewPrep.Solutions;

import java.util.Arrays;
import java.util.HashMap;

public class CountingElements {
    public int countElements(int[] arr) {
        int count = 0;
        int[] values = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            values[arr[i]]++;
        }

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > 0 && values[i + 1] > 0) {
                count += values[i];
            }
        }
        return count;
    }
}
