public class Solution {
    public int firstMissingPositive(int[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>=1&&A[i]<=A.length&&A[i]!=i+1&&A[A[i]-1]!=A[i]){
                int temp=A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = temp;
                i--;//key point, if use for loop
            }
        }
        /*int i = 0;
        while (i < A.length) {
            if (A[i] != i + 1 && A[i] >= 1 && A[i] <= A.length && A[A[i] - 1] != A[i]) {
                int tmp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = tmp;
            } else
                i++;
        }*///while loop is easy to understand
        for(int i=0;i<A.length;i++){
            if(A[i]!=i+1){
                return i+1;
            }
        }
        return A.length+1;
    }
}