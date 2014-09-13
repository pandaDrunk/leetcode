//dichotomy method for row and column
public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int startRow=0; int endRow=m-1;
        while(startRow<=endRow){
            int midRow=(startRow+endRow)/2;
            if(matrix[midRow][0]==target){
                return true;
            }
            else if(matrix[midRow][0]<target){
                startRow=midRow+1;
            }
            else {
            	endRow=midRow-1;
            }
        }
        int row=endRow;
        if(row<0) return false;
        int startCol=0; int endCol=n-1;
        while(startCol<=endCol){
            int midCol=(startCol+endCol)/2;
            if(matrix[row][midCol]==target){
                return true;
            }
            else if(matrix[row][midCol]<target){
                startCol=midCol+1;
            }
            else {
                endCol=midCol-1;
            }
        }
        return false;
    }
}