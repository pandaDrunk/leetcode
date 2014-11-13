public class Solution {
    public double power(double x, int n) {
        double res=1;
        if(n==0||x==1) 
            return res;
        double pow2 = power(x,n/2);
        if(n%2==0){
            return res=pow2*pow2;
        }
        else {
            return res=pow2*pow2*x;
        }
    }
    public double pow(double x, int n){
        if(n<0){
            return power(1/x,-n);
        }
        else {
            return power(x,n);
        }
    }
}//binary search