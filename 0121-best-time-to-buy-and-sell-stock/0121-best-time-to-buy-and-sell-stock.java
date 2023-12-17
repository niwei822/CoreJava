class Solution {
   public int maxProfit(int[] prices) {
      int minPrice = prices[0];
      int maxprofit = 0;
      for(int price : prices) {
          if(price < minPrice) {
              minPrice = price;
          }
          maxprofit = Math.max(price - minPrice, maxprofit);
      }
       return maxprofit;
    }
}

