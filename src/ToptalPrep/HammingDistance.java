package ToptalPrep;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        int count = 0;
        while (result > 0) {
            result = result & (result - 1);
            count++;
        }
        return count;
    }
}
