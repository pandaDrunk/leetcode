public class Solution {
    public int jump1(int[] A) {
        int step=0;
        int reach=A.length-1;
        while(reach>0){
            for(int i=0;i<reach;i++){
                if(A[i]+i>=reach){
                    step++;
                    reach=i;
                    break;
                }
            }
        }
        return step;
    }//always find the first index can reach the target
    public int jump(int[] A){
        int step=0;
        int cover=0;
        int reach=0;
        for(int i=0;i<A.length;i++){
            if(i>reach){
                step++;
                reach=cover;
            }
            cover=Math.max(cover,A[i]+i);
        }
        return step;
    }//greedy jump as far as it can
}