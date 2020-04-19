package InterviewPrep.Solutions;

import java.util.HashMap;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        int[] existTemp = new int[101];
        for (int i = T.length - 1; i >= 0; i--) {
                        existTemp[T[i]] = i;
            int closestPosition = T.length;
            for (int temp = T[i] + 1; temp < 101; temp ++) {
                if (existTemp[temp] > 0) {
                    closestPosition = Math.min(closestPosition, existTemp[temp]);
                }
            }
            res[i] = closestPosition == T.length? 0 : closestPosition - i;
        }
        return res;
    }
}
