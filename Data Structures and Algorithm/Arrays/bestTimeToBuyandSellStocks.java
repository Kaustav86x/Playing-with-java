class Solution {
    public int maxProfit(int[] prices) {
        // int dip = -1;
        int profit = 0;
        int buy_price = Integer.MAX_VALUE;
        // for(int i=prices.length - 2; i>=0; i--)
        // {
        //     if(prices[i] < prices[i+1])
        //         dip = 0;
        // }
        // // if the lowest is found at the last, we won't consider it.
        // if(dip == -1)
        //     profit = 0;
        // else 
        // {
            for(int i=0; i<prices.length; i++)
            {
                buy_price = Math.min(buy_price, prices[i]);
                profit = Math.max(profit, prices[i] - buy_price);
            }
        // }
        return profit;
    }
    
}
