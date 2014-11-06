public class Solution {
    public int divide(int dividend, int divisor) {
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int res=0;
        boolean sign=true;
        
        if((dividend>0&&divisor>0)||(dividend<0&&divisor<0)){
            sign=true;
        }
        else{
            sign=false;
        }
        
        while(a>=b){
            int bit=0;
            while(a>=(b<<bit)){
                bit++;
            }
            res+=1<<(bit-1);
            a-=b<<(bit-1);
        }
        if(sign){
            return res;
        }
        else {
            return -res;
        }
    }
}