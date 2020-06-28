package Solutions.string;

public class StringToInteger {
    public int myAtoi(String str) {
        double ans = 0;
        int sign = 0;
        boolean wasZero = false;
        for (char c : str.toCharArray()) {
            if (ans == 0) {
                if (c == '-' && sign==0) sign = -1;
                else if (c == '+' && sign==0) sign = 1;
                else if (Character.isDigit(c)) {

                    ans += Character.getNumericValue(c);
                    if (ans==0) wasZero = true;
                }else if (sign!=0 && (c=='+'|| c=='-')) return 0;
                else if (c==' ' && wasZero) return 0;
                else  if (c!=' ') return 0;
            } else {
                if (sign==0) sign = 1;
                if (Character.isDigit(c)) {
                    ans =  (ans * 10) + Character.getNumericValue(c);
                }
            }
        }
        if (sign==0) sign = 1;
        ans *= sign;
        if (ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if (ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return  (int) ans;
    }
}
