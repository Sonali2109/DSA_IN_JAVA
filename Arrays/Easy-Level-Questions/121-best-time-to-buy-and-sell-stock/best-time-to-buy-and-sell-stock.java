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
        
    } 
}