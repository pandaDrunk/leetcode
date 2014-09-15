public class Solution {
    public boolean search(int[] A, int target) {
        int start=0;
        int end=A.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(A[mid]==target) return true;
            if(A[mid]>A[start]){
                if(A[mid]>target&&A[start]<=target){
                    end=mid-1;
                }
                else start=mid+1;
            }
            else if(A[mid]<A[start]){
                if(A[mid]>target||A[start]<=target){
                    end=mid-1;
                }
                else start=mid+1;
            }
            else start++;//A[start]==A[mid], then change start++
        }
    
        return false;
    }
}