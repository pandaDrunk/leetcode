public class Solution {
    public int removeDuplicates(int[] A) {
        int n=0;
        if(A.length==0) return 0;
        for(int i=1;i<A.length;i++){
            if(A[n]!=A[i]){
                A[++n]=A[i];
            }
        }
        return n+1;
    }
}