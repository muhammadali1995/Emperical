public class Shorten {
    public static void main(String[] args) {
        Shorten shorten = new Shorten();
        shorten.solution("ABBBCCDDCCC", 3);
    }

    int solution(String S, int K) {
        if (S.length()==K) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < S.length() - K; i++) {
            min = Math.min(min, this.compressed(S.substring(0, i) + S.substring(i + K)));
        }
        return min;
    }

    int compressed(String S) {
        char[] chars = S.toCharArray();
        int result = 0;
        int c = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i] == chars[i - 1]) {
                c++;
            } else {
                result += c == 1 ? 1 : (Integer.toString(c).length() + 1);
                c = 1;
            }
        }
        result += c == 1 ? 1 : (Integer.toString(c).length() + 1);
        return result;
    }
}