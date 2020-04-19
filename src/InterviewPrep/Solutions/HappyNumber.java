package InterviewPrep.Solutions;

import java.util.HashMap;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n==1) return true;
        HashMap<Integer, Boolean> results = new HashMap<>();
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n = n / 10;
            if (n < 10 && n >= 1) {
                result += Math.pow(n, 2);
                if (n == 1 && result == 1) {
                    return true;
                }
            }
            if (results.containsKey(result)) {
                return false;
            }
            if (n < 10) {
                results.put(result, true);
                n = result;
                result = 0;
            }
        }
        return true;
    }
}
