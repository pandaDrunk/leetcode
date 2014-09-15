public class Solution {
    public int search(int[] A, int target) {
        int start=0;
        int end=A.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(A[mid]==target) return mid;
            if(A[mid]>=A[start]){
                if(A[mid]>target&&A[start]<=target){
                    end=mid-1;
                }
                else start=mid+1;
            }
            else{
                if(A[mid]>target||A[start]<=target){
                    end=mid-1;
                }
                else start=mid+1;
            }
        }
    
        return -1;
    }
}