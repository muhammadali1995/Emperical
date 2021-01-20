package ToptalPrep;

public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit profit = new MaxProfit();

        profit.maxProfit(new int[]{7, 1, 2, 5, 6, 8});

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            max = Math.max(prices[i] - min, max);
            min = Math.min(prices[i], min);
        }

        return max;
    }
}
