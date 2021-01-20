package ToptalPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class KeyBoarRow {
    public static void main(String[] args) {
        KeyBoarRow row = new KeyBoarRow();
        row.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
    }

    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        String[] rows = new String[]{first, second, third};

        ArrayList<String> ans = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                map.put(c, i);
            }
        }

        for (String word : words) {
            boolean isInRow = true;
            String newWord = word.toLowerCase();
            for (int i = 0; i < newWord.length() - 1; i++) {
                int a = map.get(newWord.charAt(i));
                int b = map.get(newWord.charAt(i + 1));
                if (a != b) {
                    isInRow = false;
                    break;
                }
            }
            if (isInRow) ans.add(word);
        }

        return ans.toArray(new String[0]);
    }
}
