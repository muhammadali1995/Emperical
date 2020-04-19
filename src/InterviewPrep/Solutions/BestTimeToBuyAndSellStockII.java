package InterviewPrep.Solutions;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int nextMin = prices[0];
        int nextMax = prices[1];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (nextMin < nextMax && nextMax > prices[i]) {
                maxProfit += nextMax - nextMin;
                nextMin = prices[i];
                nextMax = prices[i];
            } else if (prices[i] > nextMax) {
                nextMax = prices[i];
            } else if (prices[i] <= nextMin) {
                nextMin = prices[i];
                nextMax = prices[i];
            } else {
                nextMax = prices[i];
            }
        }

        if (prices[prices.length-1]>=nextMax) maxProfit += nextMax - nextMin;
        return maxProfit;
    }
}
