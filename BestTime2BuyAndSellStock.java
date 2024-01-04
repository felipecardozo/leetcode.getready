package com.leetcode_getready.array;

/**
 * ref. <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">
 *      121. Best Time to Buy and Sell Stock
 *      </a>
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * </p><p>
 * <b>Example 1:</b>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * </p><p>
 * <b>Example 2:</b>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0. </p>
 * */
public class BestTime2BuyAndSellStock {

    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        int leastSoFar = Integer.MAX_VALUE; // least so far
        int bestProfitFound = 0; // overall profit
        int profitIfSoldTOday = 0; // profit if sold today

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < leastSoFar){ // if we found new buy value which is more smaller then previous one
                leastSoFar = prices[i]; // update our least so far
            }
            profitIfSoldTOday = prices[i] - leastSoFar; // calculating profit if sold today by, Buy - sell
            if(bestProfitFound < profitIfSoldTOday){ // if profitIfSoldTOday is more then our previous overall profit
                bestProfitFound = profitIfSoldTOday; // update overall profit
            }
        }
        System.out.println(bestProfitFound);
    }
}





