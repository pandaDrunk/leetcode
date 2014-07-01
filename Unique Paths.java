public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]=grid[i-1][j]+grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}
//Dynamic Programming

public class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1||n==1) return 1;
        return uniquePaths(m,n-1)+uniquePaths(m-1,n);
    }
}
//backtracking time limit exceeded