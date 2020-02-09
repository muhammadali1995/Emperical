package Solutions;

public class ReverseBits {
    public int reverseBits(int n) {
        return  Integer.reverse(n);
//        String bitsOfN = Integer.toString(n, 16);
//        StringBuilder reverseOfN = new StringBuilder();
//        for (int i = bitsOfN.length() - 1; i >= 0; i--) {
//            reverseOfN.append(bitsOfN.charAt(i));
//        }
//        return Integer.parseInt(reverseOfN.toString(), 2);
    }
}
