public class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0) return new int[0][0];
        int[][] res = new int[n][n];
        return generateMatrix(res,0,0,n,n,1);
    }
    public int[][] generateMatrix(int[][] res,int x,int y, int m,int n,int num){
        if(m<=0||n<=0) return res;
        //only one left
        if(m==1&&n==1){
            res[x][y]=num;
            return res;
        }
        //spiral add
        //top-right
        for(int i=0; i<n-1;i++){
            res[x][y++]=num++;
        }
        //right-bottom
        for(int i=0;i<m-1;i++){
            res[x++][y]=num++;
        }
        //bottom-left
        if(m>1){
            for(int i=0;i<n-1;i++){
                res[x][y--]=num++;
            }
        }
        //left-top
        if(n>1){
            for(int i=0;i<m-1;i++){
                res[x--][y]=num++;
            }
        }
        //next circle
        if(m==1||n==1){
            generateMatrix(res, x, y, 1, 1,num);
        }
        else{
            generateMatrix(res, x+1, y+1, m-2, n-2,num);
        }
        return res;
    }
}