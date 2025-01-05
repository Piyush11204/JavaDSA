package GreekOfGreeks;
public class StockBuyAndSell {

    public static void main(String[] args) {
        int[] prices = {7 ,10 ,1 ,3 ,6 ,9 ,2};
        System.out.println(maximumProfit(prices));
    }

    static int maximumProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No transaction possible
        }

        int minPrice = Integer.MAX_VALUE; // To track the minimum price
        int maxProfit = 0; // To track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate and update maximum profit
            }
        }

        return maxProfit;
    }
}