public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length<=2) return A.length ;
        boolean dup=false;
        int n=0;
        //two pointers and a label for possible duplicate
        for(int i=1; i<A.length; i++){
            if(A[n]!=A[i]){
                A[++n]=A[i];
                dup=false;
            }
            else if(A[n]==A[i]&&dup==false){
                A[++n]=A[i];
                dup=true;
            }
            
        }
        return n+1;
    }
}