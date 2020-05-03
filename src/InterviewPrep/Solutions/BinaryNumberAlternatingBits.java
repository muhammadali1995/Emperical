package InterviewPrep.Solutions;

public class BinaryNumberAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String binaryVersionOfN = Integer.toBinaryString(n);
        char currentL = binaryVersionOfN.charAt(0);
        for (int i = 1; i < binaryVersionOfN.length(); i++) {
            if (currentL == binaryVersionOfN.charAt(i)) {
                return false;
            } else {
                currentL = binaryVersionOfN.charAt(i);
            }
        }
        return true;
    }
}
