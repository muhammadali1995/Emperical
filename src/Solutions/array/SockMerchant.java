package Solutions.array;

import java.util.HashMap;

public class SockMerchant {
    public static void main(String[] args) {
        int ar[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, ar));
    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> pairs = new HashMap<>();
        int numberOfPairs = 0;
        for (int i = 0; i < ar.length; i++) {
            if (!pairs.containsKey(ar[i])) {
                pairs.put(ar[i], 1);
            } else {
                if (pairs.get(ar[i]) == 1) {
                    numberOfPairs++;
                    pairs.remove(ar[i]);
                }
            }
        }
        return numberOfPairs;
    }
}
