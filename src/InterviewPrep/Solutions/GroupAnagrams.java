package InterviewPrep.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listOfAngGrs = new ArrayList<>();
        HashMap<String, ArrayList<String>> mapOfAngGrs = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            ArrayList<String> list;
            if (mapOfAngGrs.containsKey(key)) {
                list = mapOfAngGrs.get(key);
            } else {
                list = new ArrayList<>();
            }
            list.add(strs[i]);
            mapOfAngGrs.put(key, list);
        }

        for (String key : mapOfAngGrs.keySet()) {
            listOfAngGrs.add(mapOfAngGrs.get(key));
        }

        return listOfAngGrs;
    }
}
