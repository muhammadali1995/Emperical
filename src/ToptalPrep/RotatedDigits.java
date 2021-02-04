package ToptalPrep;

import java.util.HashMap;

public class RotatedDigits {
    public static void main(String[] args) {
        RotatedDigits rotatedDigits = new RotatedDigits();
        rotatedDigits.rotatedDigits(10);
    }
    public int rotatedDigits(int N) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(9, 6);

        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (rotate(i, map)) count++;
        }

        return count;
    }




    private boolean rotate(int n, HashMap<Integer, Integer> map) {
        if (n==0) return  false;
        boolean containsValid = false;
        boolean containsInvalid = false;
        while (n > 0) {
            int r = n % 10;
            if (map.containsKey(r)) return true;
            if (r == 3 || r == 4 || r ==7) return true;
            n /= 10;
        }

        return (containsValid && !containsInvalid);

    }
}
