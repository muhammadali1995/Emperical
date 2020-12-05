package ToptalPrep;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitStringBalancedStrings {
    public static void main(String[] args) {
        SplitStringBalancedStrings splitStrings = new SplitStringBalancedStrings();
        System.out.println(splitStrings.balancedStringSplit("RLLLLRRRLR"));
    }

    public int balancedStringSplit(String s) {
        int countOfL = 0;
        int countOfR = 0;
        int countOfBalancedStrings = 0;
        for (char c : s.toCharArray()) {

            if (c == 'L') countOfL++;
            else countOfR++;

            if (countOfR == countOfL) {
                countOfBalancedStrings++;
            }
        }

        return countOfBalancedStrings;
    }
}
