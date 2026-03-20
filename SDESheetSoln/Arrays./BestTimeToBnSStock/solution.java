class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; 
        int maxPft =0; 
        for (int i=1;i<prices.length;i++) {
            minPrice = Math.min(minPrice,prices[i]); 
            maxPft = Math.max(maxPft,prices[i]-minPrice); 
        }
        return maxPft; 
    }
}