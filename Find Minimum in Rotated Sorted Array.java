public class Solution {
    public int findMin(int[] num) {
        //if(num==null||num.length==0) return null;
        return findMin(num,0,num.length-1);
    }
    public int findMin(int[] num,int m, int n){
        if(m==n) return num[m];
        if(num[m]<num[n]) return num[m];
        //if(m+1==n) return num[n];
        int mid = (m+n)/2;
        //the condition is simple
        if(num[m]>num[mid]){
            return findMin(num, m, mid);
        } else if(num[m]<num[mid]){
            return findMin(num, mid+1, n);
        } 
    }
}