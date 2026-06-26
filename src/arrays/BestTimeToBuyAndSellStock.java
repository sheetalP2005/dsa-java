package arrays;

/*
====================================================
Problem: LeetCode #121 - Best Time to Buy and Sell Stock

Difficulty:
Easy

Pattern:
Running Minimum

Time Complexity:
O(n)

Space Complexity:
O(1)

Key Idea:
Track the minimum stock price seen so far.
For every price, calculate the profit if sold today.
Update the maximum profit whenever a larger profit is found.

====================================================
*/

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {

                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}