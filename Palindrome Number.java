public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse=0;
        int copy=x;
        while(copy>=1){
            reverse=reverse*10+copy%10;
            copy/=10;
        }
        if(x==reverse){
            return true;
        }
        else
            return false;
    }
}//bease on reverse integer