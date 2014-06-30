public class Solution {
    public void sortColors(int[] A) {
        int first=0;
        int last=A.length-1;
        
        while(first<A.length&&A[first]==0) first++;
        int cur=first;
        while(last>0&&A[last]==2) last--;
        while(cur<=last){
            if(A[cur]<=A[first]){
                swap(A,first,cur);
                while(first<A.length&&A[first]==0){
                    first++;
                    cur=first;
                }
            }
            if(cur<=last&&A[cur]>A[last]){
                swap(A,cur,last);
                while(last>0&&A[last]==2) last--;
            }
            else cur++;
        }
    }
    public void swap(int[] B,int a,int b) {
        int temp;
        temp=B[b];
        B[b]=B[a];
        B[a]=temp;
    }
    
}
//One Pass Algorithm
//stop condition is current is larger than the last mark.

public class Solution {
    public void sortColors(int[] A) {
        int[] B=new int[3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<3;j++){
                if(A[i]==j){
                    B[j]++;
                }
            }
        }
        //simple one: for(int i=0;i<A.length;i++) {B[A[i]]++;}
        int begin=0;
        for(int j=0;j<3;j++){
            for(int i=0;i<B[j];i++){
                A[begin++]=j;
            }
        }
    }
}
//two pass Algorithm
