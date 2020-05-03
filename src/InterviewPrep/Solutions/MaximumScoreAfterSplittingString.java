package InterviewPrep.Solutions;

public class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        int countOfOnes = 0;
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOfOnes++;
                lastIndex = i;
            }
        }
        if (countOfOnes==0) return s.length() - 1;
        int max = 0;
        int countOfZeroesAtIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') countOfZeroesAtIndex++;
            int countOfOnesAtIndex = i + 1 - countOfZeroesAtIndex;
            int result = (countOfOnes - countOfOnesAtIndex) + countOfZeroesAtIndex;
            if (result > max) max = result;
        }

        return max;
    }
}
