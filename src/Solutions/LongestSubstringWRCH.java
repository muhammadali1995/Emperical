package Solutions;

import java.util.ArrayList;

/**
 * Created by User on 7/21/2018.
 */
public class LongestSubstringWRCH {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("cncn"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        }

        String subString = "";
        int longestStrLength = 0;

        for (int k = 0; k < s.length(); k++) {
            for (int i = k; i < s.length(); i++) {
                if (subString.contains(s.substring(i, i + 1))) {
                    //update longestStrLength if it is smaller then the subString
                    if (longestStrLength < subString.length()) {
                        longestStrLength = subString.length();
                    }
                    // if character is repeated then update subString
                    subString = "";
                    break;
                } else {
                    subString += s.charAt(i);
                }
            }
        }

        return longestStrLength;
    }
}
