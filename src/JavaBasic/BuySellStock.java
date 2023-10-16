package JavaBasic;

public class BuySellStock {
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = prices[0];
		
		for(int i=1;i<prices.length;i++) {
			// Update the if a smaller price is encountered
			if(prices[i]<minPrice) {
				minPrice = prices[i];
			} else {
				int profit = prices[i] - minPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}
	/*
	 * int max_profit = 0;
        for(int j=0;j<prices.length;j++) {
            for(int i=j+1;i<prices.length;i++) {
                if(prices[i] > prices[j]) {
                    int profit = prices[i] - prices[j];
                    max_profit = Math.max(max_profit, profit);
                }
            }       
            }
            return max_profit;
        }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
