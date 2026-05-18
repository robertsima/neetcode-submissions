class Solution {
    public int maxProfit(int[] prices) {
        int right = 1, left = 0, minCost = 0, mostProfit = 0;  

        while(right < prices.length) { 
            int currentProfit = prices[right] - prices[left];

            if(prices[right] < prices[left]) { 
                left = right; 
            }

            mostProfit = Math.max(currentProfit, mostProfit);
            right ++; 
        }

        return mostProfit; 
    }
}
