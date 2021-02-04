package ToptalPrep;

public class MaximumNumberofBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] counter = new int[26];
        char[] letters = text.toCharArray();
        for (char c : letters) {
            counter[c - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for (char c : "balloon".toCharArray()) {
            min = Math.min(min, counter[c - 'a']);
        }


        return min;

    }
}
