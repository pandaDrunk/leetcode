public class Solution {
    public int singleNumber(int[] A) {
        int l=A.length;
        int single=0;
        for(int i=0;i<l;i++){
            single=single^A[i];
        }
        return single;
    }
}