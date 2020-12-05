package ToptalPrep;

public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();

        System.out.println(toLowerCase.toLowerCase("H&ello"));
    }

    public String toLowerCase(String str) {
        StringBuilder lowerCasedString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c < 91 && c > 64) {
                c += 32;
            }
            lowerCasedString.append(c);
        }
        return lowerCasedString.toString();
    }
}
