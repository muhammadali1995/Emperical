package InterviewPrep.Solutions;

public class MaxDifferenceYouCanGetFromChangingInteger {
    public int maxDiff(int num) {

        int max = getMax(num);
        int min = getMin(num);
        System.out.println(min + "  " + max);

        return max - min;
    }

    private int getMax(int num) {
        String s = "" + num;
        char[] chars = s.toCharArray();
        char c = chars[0];

        for (int i =0; i < chars.length; i++) {
            if (chars[i] != '9') {
                char c1 = chars[i];
                chars[i] = '9';
                for (int j = i; j < s.length(); j++) {
                    if (chars[j] == c1) {
                        chars[j] = '9';
                    }
                }
                break;
            }
        }

        return charArrToNumber(chars);
    }

    private int charArrToNumber(char chars[]){
        int result = 0;
        int multiple = 1;
        for (int i = chars.length-1; i >=0 ; i--) {
            result += multiple * Integer.parseInt("" + chars[i]);
            multiple *= 10;
        }

        return result;
    }

    private int getMin(int num) {
        String s = "" + num;
        char[] chars = s.toCharArray();
        char c = s.charAt(0);
        if (c != '1') {
            chars[0] = '1';
            for (int j = 1; j < s.length(); j++) {
                if (chars[j] == c) chars[j] = '1';
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (chars[i] != '0' && chars[i]!= '1') {
                    char c1 = chars[i];
                    chars[i] = '0';
                    for (int j = i; j < s.length(); j++) {
                        if (chars[j] == c1) {
                            chars[j] = '0';
                        }
                    }
                    break;
                }
            }
        }
        return charArrToNumber(chars);
    }
}
