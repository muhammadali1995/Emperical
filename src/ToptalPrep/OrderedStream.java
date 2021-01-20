package ToptalPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderedStream {

    public static void main(String[] args) {
        String a  = "hello";
        String b = "hello";
        System.out.println(a.matches(b));
        System.out.println(true);
    }
    int maxSoFar = 0;
    String[] stream;

    public OrderedStream(int n) {
        this.stream = new String[n];
    }

    public List<String> insert(int id, String value) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < maxSoFar; i++) {
            if (stream[i] != null) list.add(stream[i]);
        }
        stream[id - 1] = value;
        maxSoFar = Math.max(maxSoFar, id);
        return list;

    }


    static HashMap<String, String> ans = new HashMap<>();

    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
        // your code goes here


        for(String key: dict.keySet()){
            Object value = dict.get(key); //"1"
            help(value, key);
        }

        return ans;

    }


    static void help(Object value, String key) {


        if(value instanceof String){
            ans.put(key, value.toString());
            return;
        } else if(value instanceof HashMap) {

            HashMap<String, Object> map = (HashMap) value;
            for (String innerkey : map.keySet()) {
                help(map.get(innerkey), key + "." + innerkey);
            }
        }
        }
}
