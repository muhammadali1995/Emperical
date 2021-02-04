package ToptalPrep;

import java.util.Arrays;
import java.util.HashMap;

public class SetenceReverse {


    static char[] reverseWords(char[] arr) {
        // your code goes here

        System.out.println("first line test");

        for(int i =0; i< arr.length/2; i++) {
            char  temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));

        int i = 0;
        int j = 0;
        while(i<arr.length) {
            System.out.println(i);

            if (arr[i] == ' ') {
                swap(j, i - 1, arr);
                j = i + 1;
            }
            i++;
        }

//        swap(j, i-1, arr);

        return arr;
    }


    static void  swap(int start, int end, char [] arr) {
        while(start<end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[]  arr = new char[]{'p', 'e', 'r', 'f', 'e', 'c', 't',' ','m','a', 'k', 'e', 's',' ','p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
        System.out.println(Arrays.toString(reverseWords(arr)));
    }


    static HashMap<String, String> flattenDictionary(HashMap<String, Object> dict) {
        // your code goes here
        HashMap<String, String> ans = new HashMap<>();


        for(String key: dict.keySet()){
            Object value = dict.get(key); //"1"
            help(value, key, ans);
        }

        return ans;

    }


    static void help(Object value, String key, HashMap<String, String> newMap) {

        if(value instanceof HashMap) {
            HashMap<String, Object> map = (HashMap) value;
            for(String innerkey : map.keySet()){
                if(key.equals("")){
                    help(map.get(innerkey), innerkey, newMap);
                } else if(innerkey.equals("")){
                    help(map.get(innerkey), key, newMap);
                } else {
                    help(map.get(innerkey), key+"."+ innerkey, newMap);
                }
            }
        } else {
            newMap.put(key, value.toString());
        }
    }





}
