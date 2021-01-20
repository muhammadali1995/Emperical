package ToptalPrep;

import java.util.ArrayList;

public class OccurencesAfterBigram {
    public static void main(String[] args) {
        OccurencesAfterBigram c = new OccurencesAfterBigram();
        c.findOcurrences("alice is a good girl she is a good student", "a", "good");
    }
    public String[] findOcurrences(String text, String first, String second) {

        String [] words  = text.split(" ");

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<words.length-2; i++) {
            if(words[i].equals(first) && words[i+1].equals(second)) {
                ans.add(words[i+2]);
                i = i+1;
            }
        }


        String [] result = new String [ans.size()];
        int i=0;
        for(String word: ans){
            result[i++] = word;
        }

        return result;



    }
}
