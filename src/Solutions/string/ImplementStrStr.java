package Solutions.string;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()|| haystack.length()==needle.length() && haystack.equals(needle)) return 0;
        for (int i = 0; i < haystack.length() - needle.length()+1; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) return i;
        }
        return -1;
    }
}
