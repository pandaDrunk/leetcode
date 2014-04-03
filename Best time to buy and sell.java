public class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        if(prices.length==0) return 0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}