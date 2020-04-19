package InterviewPrep.Solutions;


import java.util.Stack;

public class ReformatTheString {
    public String reformat(String s) {

        Stack<Integer> numbers = new Stack();
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.push(s.charAt(i));
            }else{
                numbers.push(Character.getNumericValue(s.charAt(i)));
            }
        }

        if (Math.abs(letters.size()-numbers.size())>1) return "";
        else {
            StringBuilder stringBuilder = new StringBuilder();
            if (letters.size()>=numbers.size()){
                while (letters.size()>0) {
                    stringBuilder.append(letters.pop());
                    if (numbers.size() > 0) {
                        stringBuilder.append(numbers.pop());
                    }
                }
            }else {
                while (numbers.size()>0) {
                    stringBuilder.append(numbers.pop());
                    if (letters.size() > 0) {
                        stringBuilder.append(letters.pop());
                    }
                }
            }

            return stringBuilder.toString();
        }
    }
}
