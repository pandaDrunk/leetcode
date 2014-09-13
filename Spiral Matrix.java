public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if(m==0||matrix==null) return new ArrayList<Integer>();
        int n = matrix[0].length;
        return spiralOrder(matrix, 0, 0, m, n);
    }
    public ArrayList<Integer> spiralOrder(int[][] matrix,int x,int y, int m,int n){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(m<=0||n<=0) return res;
        //only one left
        if(m==1&&n==1){
            res.add(matrix[x][y]);
            return res;
        }
        //spiral add
        //top-right
        for(int i=0; i<n-1;i++){
            res.add(matrix[x][y++]);
        }
        //right-bottom
        for(int i=0;i<m-1;i++){
            res.add(matrix[x++][y]);
        }
        //bottom-left
        if(m>1){
            for(int i=0;i<n-1;i++){
                res.add(matrix[x][y--]);
            }
        }
        //left-top
        if(n>1){
            for(int i=0;i<m-1;i++){
                res.add(matrix[x--][y]);
            }
        }
        //next circle
        if(m==1||n==1){
            res.addAll(spiralOrder(matrix, x, y, 1, 1));
        }
        else{
            res.addAll(spiralOrder(matrix, x+1, y+1, m-2, n-2));
        }
        return res;
    }
}