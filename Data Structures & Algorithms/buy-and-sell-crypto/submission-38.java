class Solution {
    public int maxProfit(int[] prices) {
        int mostProfit = 0;
        int minCost = 0; 

        for(int right = 1, left = 0;  right < prices.length ; right ++) {
            int currentProfit = prices[right] - prices[left];
            if(prices[right] < prices[left]) { 
                left = right; 
            }
            
            mostProfit = Math.max(currentProfit, mostProfit);
        }

        return mostProfit; 
    }
}
