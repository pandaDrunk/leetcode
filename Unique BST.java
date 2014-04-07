public class Solution {
    public int numTrees(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=0;
        }
        ans[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ans[i]+=(ans[j-1]*ans[i-j]);
            }
        }
        return ans[n];
    }
}