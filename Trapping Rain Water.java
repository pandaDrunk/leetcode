public class Solution {
    public int trap(int[] A) {
        if(A==null||A.length==0) return 0;
        int max;
        int[] left= new int[A.length];
        int[] right= new int[A.length];
        int res=0;
        
        //from left to right
        max=A[0];
        left[0]=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]<max){
                left[i]=max;
            }
            else {
                left[i]=A[i];
                max=A[i];
            }
        }
        //from right to left
        max=A[A.length-1];
        right[A.length-1]=A[A.length-1];
        for(int i=A.length-1;i>=0;i--){
            if(A[i]<max){
                right[i]=max;
            }
            else {
                right[i]=A[i];
                max=A[i];
            }
        }
        //trapping water
        
        for(int i=0;i<A.length;i++){
            int vol=Math.min(left[i],right[i])-A[i];
            if(vol>0){
                res+=vol;
            }
        }
        return res;
    }
}