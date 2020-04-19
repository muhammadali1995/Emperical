package InterviewPrep.Solutions;


import java.util.ArrayList;
import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        int result = 0;
        StringBuilder substring = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '+' || s.charAt(i) != '-' || s.charAt(i) != '(' || s.charAt(i) != ')' || s.charAt(i) != ' ') {
                if (substring.length()>0){
                    list.add(substring.toString());
                    substring = new StringBuilder();
                }
                list.add(""+s.charAt(i));
            } else {
                substring.append(s.charAt(i));
            }

        }


        char[] valueChars = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        if (s.indexOf('(') > -1) {
            char parentOperator = '+';
            for (char valueChar : valueChars) {
                if (valueChar != ' ') {
                    if (valueChar != ')') {
                        if (valueChar == '(' && characterStack.size() > 0) parentOperator = characterStack.pop();
                        characterStack.push(valueChar);
                    } else {
                        while (characterStack.size() > 0 && characterStack.peek() != '(') {
                            int value = Character.getNumericValue(characterStack.pop());
                            char operator = characterStack.pop();
                            if (parentOperator == '+') {
                                if (operator == '-') {
                                    result -= value;
                                } else {
                                    result += value;
                                }
                            } else {
                                if (operator == '-') {
                                    result += value;
                                } else {
                                    result -= value;
                                }
                            }
                            if (operator == '(') break;
                        }
                        if (characterStack.size() > 0 && characterStack.peek() == '(') characterStack.pop();
                    }
                }
            }

            if (characterStack.size() > 0) {
                while (characterStack.size() > 1) {
                    int value = Character.getNumericValue(characterStack.pop());
                    char operator = characterStack.pop();
                    if (parentOperator == '+') {
                        if (operator == '-') {
                            result -= value;
                        } else {
                            result += value;
                        }
                    } else {
                        if (operator == '-') {
                            result += value;
                        } else {
                            result -= value;
                        }
                    }
                    if (operator == '(') break;
                }
                if (characterStack.size() > 0 && characterStack.peek() != '(')
                    result += Character.getNumericValue(characterStack.pop());
            }


        } else if (s.indexOf('+') > 0 | s.indexOf('-') > 0) {
            char operator = ' ';
            for (char valueChar : valueChars) {
                if (valueChar == ' ') continue;
                if (valueChar == '-' || valueChar == '+') {
                    operator = valueChar;
                } else if (Character.isDigit(valueChar)) {
                    if (operator == '-') {
                        result -= Character.getNumericValue(valueChar);
                    } else {
                        result += Character.getNumericValue(valueChar);
                    }
                }
            }
        } else {
            result = Integer.parseInt(s.trim());
        }
        return result;
    }
}
