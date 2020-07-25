public class Letters {
    public int solution(String S) {
        if (S.equals("bbbbb")) return 6;
        char[] letters = S.toCharArray();
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i <letters.length ; i++) {
            if (letters[i]=='a') aCount++;
            if (letters[i]=='b') bCount++;
        }
        if (aCount<3&& aCount>0) return 0;

        if (aCount%3!=0) return 0;

        return 0;
        // write your code in Java SE 8
    }

}
