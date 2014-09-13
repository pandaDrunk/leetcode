public class Solution {
    public int maxArea(int[] height) {
        int most=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                most=Math.max(height[left]*(right-left),most);
                left++;
            }
            else{
                most=Math.max(height[right]*(right-left),most);
                right--;
            }
        }
        return most;
    }
}