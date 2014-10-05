public class Solution {
    public int[] searchRange(int[] A, int target) {
        int start=0;
        int end=A.length-1;
        int mid;
        int[] range = new int[2];
        range[0]=-1;
        range[1]=-1;
        //search for starting position
        while(start<end){
            mid=(start+end)/2;
            if(A[mid]<target){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        //target is not found
        if(A[start]!=target) return range;
        //set starting position
        range[0]=start;
        //search for ending postion
        end=A.length;
        while(start<end){
            mid=(start+end)/2;
            if(A[mid]>target){
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        range[1]=end-1;
        
        return range;
    }
}