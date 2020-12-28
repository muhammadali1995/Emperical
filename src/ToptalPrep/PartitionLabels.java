package ToptalPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        PartitionLabels labels = new PartitionLabels();
        System.out.println(labels.partitionLabels("ababcbacadefegdehijhklij"));
    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> results = new ArrayList<>();
        int lastIndex = 0;
        int startingIndex = 0;
        HashSet<Character> set = new HashSet<>();
        char[] letters = S.toCharArray();

        while (lastIndex < S.length() - 1) {
            int nextResult = startingIndex;
            set.add(letters[startingIndex]);
            lastIndex = findLastIndex(letters[startingIndex], letters, ++startingIndex);
            while (startingIndex < lastIndex) {
                while (set.contains(letters[startingIndex]) && startingIndex < lastIndex) ++startingIndex;
                set.add(letters[startingIndex]);
                int nextLastIndex = findLastIndex(letters[startingIndex], letters, ++startingIndex);
                if (nextLastIndex > lastIndex) lastIndex = nextLastIndex;

            }
            results.add(lastIndex - nextResult + 1);
            startingIndex = lastIndex + 1;
        }
        return results;

    }


    private int findLastIndex(char c, char[] letters, int startingIndex) {
        int lastIndex = startingIndex - 1;
        for (int i = startingIndex; i < letters.length; i++) {
            if (letters[i] == c) lastIndex = i;
        }

        return lastIndex;
    }
}
