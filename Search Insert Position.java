public class Solution {
    public int searchInsert(int[] A, int target) {
        for(int i=0; i<A.length; i++){
            if (A[i]==target) return i; 
            else if(A[i]<target&&i==A.length-1) return i+1;
            else if(A[i]<target&&A[i+1]>target) return i+1;
        }
        return 0;
    }
}