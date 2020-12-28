package ToptalPrep;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers dividingNumbers = new SelfDividingNumbers();
        dividingNumbers.selfDividingNumbers(105, 107);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> selfDivNumbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                selfDivNumbers.add(i);
            }
        }
        return selfDivNumbers;
    }

    private boolean isSelfDividing(int a) {


        if ((a > 0 && a < 10)) return true;
        //check if number contains zero

        if (a % 10 == 0) return false;

        int temp = a;
        while (temp > 1) {
            int nextNumber = temp % 10;
            if (nextNumber == 0 || a % nextNumber != 0) return false;
            temp = temp / 10;
        }

        return true;
    }
}
