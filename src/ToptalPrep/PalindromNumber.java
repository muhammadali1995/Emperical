package ToptalPrep;

import java.util.ArrayList;

public class PalindromNumber {
    public static void main(String[] args) {
        PalindromNumber number = new PalindromNumber();
        number.isPalindrome(10);
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        if(x<10) return true;

        ArrayList<Integer> list = new ArrayList<>();

        while(x>0) {
            int nextDigit = x%10;
            list.add(nextDigit);
            x = x/10;
        }

        for(int i=0; i<(list.size()/2); i++){
            if(list.get(i)!=list.get(list.size()-1-i)) return false;
        }

        return true;


    }
}
