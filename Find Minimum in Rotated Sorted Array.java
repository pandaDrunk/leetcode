public class Solution {
    public int findMin(int[] num) {
        //if(num==null||num.length==0) return null;
        return findMin(num,0,num.length-1);
    }
    public int findMin(int[] num,int m, int n){
        if(m==n) return num[m];
        if(num[m]<num[n]) return num[m];
        
        int mid = (m+n)/2;
        int half1=0;
        int half2=0;
        if(num[m]<num[mid]){
            half1=num[m];
        } else {
            half1=num[mid];
        }
        if(num[n]<num[mid]){
            half2=num[n];
        } else {
            half2=num[mid+1];
        }
        if(half1<half2){
            return findMin(num, m, mid);
        } else {
            return findMin(num, mid+1, n);
        }
    }
}