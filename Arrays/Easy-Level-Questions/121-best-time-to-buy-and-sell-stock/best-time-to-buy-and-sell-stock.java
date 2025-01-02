class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++)
        {
            int curProfit = prices[i] - buy;
            profit = Math.max( profit, curProfit );
            buy = Math.min( buy, prices[i] );
        }

        return profit;

        // Another Approach
/*
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]< buy)
                buy = prices[i];
            
            if(prices[i] - buy > sell)
                sell = prices[i] - buy;
        }

        return sell;
*/
    }
}
