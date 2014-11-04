public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int res=0;
        int min=Math.abs((num[0]+num[1]+num[2])-target);
        Arrays.sort(num);
        
        for(int i=0;i<num.length;i++){
            int start=i+1;
            int end=num.length-1;
            while(start<end){
                int sum=num[i]+num[start]+num[end];
                int diff=Math.abs(sum-target);
                if(diff<=min){
                    min=diff;
                    res=sum;
                }
                if(sum<target){
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return res;
    }
}