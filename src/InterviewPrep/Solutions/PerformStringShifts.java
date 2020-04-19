package InterviewPrep.Solutions;

import java.util.LinkedList;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        LinkedList<Character> charsOfS = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            charsOfS.addLast(s.charAt(i));
        }

        for (int i = 0; i <shift.length ; i++) {
            for (int j = 0; j <shift[i][1] ; j++) {
                 if (shift[i][0]==0) {
                     char c = charsOfS.removeFirst();
                     charsOfS.addLast(c);
                 }else{
                     char c = charsOfS.removeLast();
                     charsOfS.addFirst(c);
                 }
            }
        }
        StringBuilder s2 = new StringBuilder();
        while (charsOfS.size()>0) {
            s2.append(charsOfS.removeFirst());
        }
        return s2.toString();
    }
}
