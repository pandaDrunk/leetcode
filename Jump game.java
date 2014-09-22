public class Solution {
    public boolean canJump1(int[] A) {
        int n=A.length;
        int[] reach=new int[n];
        reach[0]=0;
        
        for(int i=1;i<n;i++){
            reach[i]=Math.max(reach[i-1],A[i-1])-1;
            if(reach[i]<0){
                return false;
            }
        }
        return reach[n-1]>=0;
    }//DP, reach[] records the status of i

    public boolean canJump(int[] A) {
        int cover=0;
        int n=A.length;
        for(int i=0;i<=cover&&i<n;i++){
            if(A[i]+i>cover){
                cover=A[i]+i;
            }
            if(cover>=n-1) return true;
        }
        return false;
    }//one round DP without other space
}
