public class Solution {  
    public int maxProfit(int[] prices){
        int res=0;
        if(prices.length<=1) return res;
        
        int[] max1 = new int[prices.length];
        int[] max2 = new int[prices.length];
        int low=prices[0];
        int high=prices[prices.length-1];
        //from head to tail
        max1[0]=0;
        for(int i=1;i<prices.length;i++){
            max1[i]=Math.max(max1[i-1],prices[i]-low);
            low=Math.min(low,prices[i]);
        }
        //from tail to head
        max2[prices.length-1]=0;
        for(int i=prices.length-2;i>=0;i--){
            max2[i]=Math.max(max2[i+1],high-prices[i]);
            high=Math.max(high,prices[i]);
        }
        //find result
        for(int i=0;i<prices.length;i++){
            res=Math.max(res,max1[i]+max2[i]);
        }
        return res;
        
    }
}