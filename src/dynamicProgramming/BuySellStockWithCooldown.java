package dynamicProgramming;

public class BuySellStockWithCooldown {
  //You are given an array prices where prices[i] is the price of a given stock on the ith day.  //
  //Find the maximum profit you can achieve. You may complete as many transactions as you like
  // (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
  //After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).

  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length < 1) {
      return 0;
    }

    int length = prices.length;
    // buy[i]: max profit if the first "i" days end with a "buy" day
    int[] buy = new int[length + 1];
    // buy[i]: max profit if the first "i" days end with a "sell" day
    int[] sell = new int[length + 1];

    buy[1] = -prices[0];

    for (int i = 2; i <= length; i++) {
      int price = prices[i - 1];
      buy[i] = Math.max(buy[i - 1], sell[i - 2] - price);
      sell[i] = Math.max(sell[i - 1], buy[i - 1] + price);
    }

    // sell[length] >= buy[length]
    return sell[length];
  }

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{1}));
  }

}
