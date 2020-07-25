package Solutions.string;

public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
        char[] letters = chars.toCharArray();
        int result = 0;
        int[] count = new int[128];
        for (char c : letters) {
            count[c]++;
        }
        for (String word : words) {
            if (isGoodString(count.clone(), word)) result += word.length();
        }
        return result;
    }

    private boolean isGoodString(int[] count, String word) {
        char[] chars = word.toCharArray();
        for (char c : chars) {
            count[c]--;
            if (count[c] < 0) return false;
        }
        return true;
    }
}
