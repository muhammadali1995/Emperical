package InterviewPrep.Solutions;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public List<String> stringMatching(String[] words) {

        List<String> substings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <words.length ; j++) {
                if (i!=j && words[i].contains(words[j]) && !substings.contains(words[j])){
                    substings.add(words[j]);
                }

            }
        }
        return substings;
    }
}
