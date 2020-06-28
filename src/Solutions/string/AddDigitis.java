package Solutions.string;

public class AddDigitis {
    public int addDigits(int num) {
        String numberInS = String.valueOf(num);

        while (numberInS.length() > 1) {
            int a = 0;
            for (char c : numberInS.toCharArray()) {
                a += Character.getNumericValue(c);
            }
            numberInS = String.valueOf(a);
        }

        return Integer.parseInt(numberInS);
    }

}
