/*  Question - You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Learnings:

1. In descending array we cannot make the profits, it will always in loss then return 0 .
2. Profit = sellingPrice - buyPrice


*/
public class BestTimeToBuySellStock {

    public static int buyAndSellStocks(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(arr));
        // TC - O(n)

    }
}
