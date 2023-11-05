package JavaBasic.Grind75questions;

public class sellStocks {
	// TODO Auto-generated method stub
	/**
	 * @param prices: Given an integer array
	 * @return: Maximum profit Input: [1, 2, 3, 4, 5] Output: 4
	 */
	public int maxProfit(int[] prices) {
		int min_price = prices[0];
		int maxProfit = 0;
		for (int price : prices) {
			if (price < min_price) {
				min_price = price;
			}
			int profit = price - min_price;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		sellStocks s = new sellStocks();
		int[] prices = {3, 2, 3, 1, 2};
		System.out.println(s.maxProfit(prices));
	}
}
