public class Solution {
    public void nextPermutation(int[] num) {
        if(num.length<2) return;
        for(int i=num.length-1;i>0;i--){
            if(num[i]>num[i-1]){
                for(int j=num.length-1;j>=0;j--){
                    if(num[j]>num[i-1]){
                        swap(num, j, i-1);
                        reverse(num,i,num.length-1);
                        return;
                    }
                }
            }
        }
        reverse(num,0,num.length-1);
        return;
    }
    public void swap(int[] num, int a, int b){
        int temp=0;
        temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
    public void reverse(int[] num, int start, int end){
        if(start>end) return;
        for(int i=start;i<=(start+end)/2;i++){
            swap(num, i, start+end-i);
        }
    }
}//http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html