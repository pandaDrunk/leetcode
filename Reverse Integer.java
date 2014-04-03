public class Solution {
    public int reverse(int x) {
        int rev=0;
        int a=1;
        if(x<0) {
            x=-x;
            a=-1;
        }
        if(x==0) return rev;
        while(x>=1){
            rev=rev*10+x%10;
            x/=10;
    }
    return rev*a;
}
}