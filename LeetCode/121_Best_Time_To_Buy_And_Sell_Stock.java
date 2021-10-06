class Solution {
    public int maxProfit(int[] prices) {
        int minPrice =  Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int x = 0; x < prices.length; x++){
            if(prices[x] < minPrice){
                minPrice = prices[x];
            }else if(prices[x] - minPrice > maxProfit){
                maxProfit = prices[x] - minPrice;
            }
        }
        return maxProfit;
        
    }
}