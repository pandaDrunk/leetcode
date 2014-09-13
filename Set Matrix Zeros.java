public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==0&&n==0) return;
        boolean rowZero = false;
        boolean colZero = false;
        //check first row and column
        for(int i=0; i<m;i++){
            if(matrix[i][0]==0) colZero=true;
        }
        for(int i=0; i<n;i++){
            if(matrix[0][i]==0) rowZero=true;
        }
        //check the rest of matrix, set 0 to first row and column
        for(int i=1; i<m; i++){
            for(int j=1; j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //set 0
        for(int i=1; i<m;i++){
            for(int j=1; j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //set 0 to first row and column
        if(rowZero==true){
            for(int i=0; i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(colZero==true){
            for(int i=0; i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}