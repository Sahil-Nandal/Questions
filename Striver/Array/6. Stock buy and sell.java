class Solution {
    public int maxProfit(int[] prices) {
        
        
        int diff=0;
        int minP=prices[0];
        for(int i=0; i<prices.length; i++){

            if(prices[i]-minP>diff){
                diff = prices[i]-minP;
            }

            if(prices[i]<minP){
                minP=prices[i];
            }
            
        }
        return diff;
    }
}
