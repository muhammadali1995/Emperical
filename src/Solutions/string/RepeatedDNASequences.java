package Solutions.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> listOfRepeatedSubstring = new HashMap<>();
       List<String> listOfRepeatedSubstring2 = new ArrayList<>();

        for (int i = 0; i < s.length()-10; i++) {
            String currentSubstring = s.substring(i, i + 10);
            if (!listOfRepeatedSubstring.containsKey(currentSubstring)){
                for (int j = i+1; j <=s.length()-10; j++) {
                    if (currentSubstring.equals(s.substring(j, j + 10))) {
                        listOfRepeatedSubstring.put(currentSubstring, 2);
                        listOfRepeatedSubstring2.add(currentSubstring);
                        break;
                    }
                }
            }

        }

        return listOfRepeatedSubstring2;
    }
}
